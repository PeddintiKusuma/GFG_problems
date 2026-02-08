#User function Template for python3

class Solution:
    
    #Complete this function
    
    #Function to return the name of candidate that received maximum votes.
    def winner(self,arr,n):
        # Your code here
        # return the name of the winning candidate and the votes he recieved
        votes = {}

        for name in arr:
            votes[name] = votes.get(name, 0) + 1

        max_votes = 0
        
        winner_name = None

        for name, count in votes.items():
            if max_votes == 0:
                max_votes = count
                winner_name = name
            elif count > max_votes:
                max_votes = count
                winner_name = name
            elif count == max_votes and name < winner_name:
                winner_name = name

        return [winner_name, str(max_votes)]

