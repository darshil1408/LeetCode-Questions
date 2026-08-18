class Solution:
    def generate(self, numRows):
        triangle = []

        for current_row in range(numRows):
            row = [1] * (current_row + 1)
            for i in range(1, current_row):
                row[i] = triangle[current_row - 1][i - 1] + triangle[current_row - 1][i]
            triangle.append(row)
        
        return triangle
