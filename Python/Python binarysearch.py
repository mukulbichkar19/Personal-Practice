""" Binary Search in python """

def binary_search(input_array, value):
    low = 0
    high = len(input_array)-1
    while(low <= high):
        mid = (low + high) / 2
        if input_array[mid] == value:
            return True
        elif input_array[mid] > value:
            return binary_search(input_array[:mid],value)
        elif input_array[mid] < value:
            return binary_search(input_array[mid+1:],value)
    
    return -1
    
test_list = [1,3,9,11,15,19,29]
test_val = 25

print binary_search(test_list,test_val)