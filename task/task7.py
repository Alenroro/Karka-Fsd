def modify_list(input):
    output = []

    for i in range(len(input)):
        output.append(input[i])
        if i > 0:
            output.append(input[i] + input[i - 1])
    return output

input = [5, 10, 20, 2, 0, 33, 100, 90]
output = modify_list(input)

print(output)
