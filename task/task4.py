def remove_spaces(input_string):
    result=""
    for char in input_string:
        if char!=' ':
            result+=char
    return result

input="Remove spaces from this string"
output=remove_spaces(input)
print(output)
