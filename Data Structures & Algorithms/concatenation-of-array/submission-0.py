class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        result = []
        i = 0
        while i < 2:
            for num in nums:
                result.append(num)
            i += 1
        return result