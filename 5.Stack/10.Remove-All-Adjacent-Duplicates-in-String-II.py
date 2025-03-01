class Solution:
    def removeDuplicates(self, s: str, k: int) -> str:

        stack = [] 

        for c in s:
            if stack and stack[-1][0] == c: #checking stack not empty and top equal to c
                stack[-1][1] += 1  #if true then increase the count for char

            else:
                stack.append([c, 1]) # if char is not on top of stack
            
            if(stack[-1][1]) == k: #check if stack char count reach the k
                stack.pop()  #pop out from stack
        
        res = ""

        for char, count in stack:
            res += (char * count)

        return res
        