
def modify_array(input_array):
    output_array = []

    for num in input_array:
        output_array.append(num)
        if len(output_array) > 1:
            output_array.append(num + output_array[-2])

    input_array.clear()
    input_array.extend(output_array)

# Example usage
input_array = [5, 10, 20, 2, 0, 33, 100, 90]
modify_array(input_array)
print(input_array)
