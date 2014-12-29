__author__ = 'gersonda'

class Solution:
    # @param s, a string
    # @return a string
    def reverseWords(self, s):
        wordstring = str(s)
        wordset = ' '.join(wordstring.split())
        if(wordset == " "):
            return ""
        wordarray=wordset.split(" ")

        for x in range(0, len(wordarray)):
            if(x == 0):
                outstring = wordarray[len(wordarray) - 1 - x]
            else:
                outstring = outstring + " " + wordarray[len(wordarray) - 1 - x]
        return outstring