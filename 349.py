#Intersection of Two arrays

class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        n1=len(nums1)
        n3=[]
        for i in range(n1):
            if nums1[i] in nums2 and nums1[i] not in n3:
                n3.append(nums1[i])
        return n3
