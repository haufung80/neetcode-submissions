class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        tmp = set()
        for num in nums:
            if num in tmp:
                return True
            tmp.add(num)
        return False