class Solution:
    def minEatingSpeed(self, piles: list[int], h: int) -> int:
        lo, hi = 1, max(piles)

        def can_finish(speed: int) -> bool:
            return sum(math.ceil(pile / speed) for pile in piles) <= h

        while lo < hi:
            mid = lo + (hi - lo) // 2
            if can_finish(mid):
                hi = mid
            else:
                lo = mid + 1

        return lo