class Solution:
    def winner(self, arr):
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
