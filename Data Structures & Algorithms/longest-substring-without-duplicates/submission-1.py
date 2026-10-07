class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        charSet = set()
        l = 0
        res = 0

        for c in s:
            while c in charSet:
                charSet.remove(s[l])
                l += 1
            charSet.add(c)
            res = max(res, len(charSet))
        return res

