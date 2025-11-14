class Solution:
    def countPrefixSuffixPairs(self, words: List[str]) -> int:
        #words = ["a","aba","ababa","aa"]
        count = 0
        for i in range(0,len(words)):
            for j in range(i+1, len(words)):
                print("i:",i,"j:",j)
                if words[j].startswith(words[i]) and words[j].endswith(words[i]):
                    count+=1
        return count

        