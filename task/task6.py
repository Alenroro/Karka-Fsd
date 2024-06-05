def strong_password(password):
    if len(password) < 8:
        return False
    
    if not any(char.islower() for char in password):
        return False
    
    if not any(char.isupper() for char in password):
        return False
    
    if not any(char.isdigit() for char in password):
        return False
    
    if not any(not char.isalnum() for char in password):
        return False

    return True

password = "StrongP@ssword123"
if strong_password(password):
    print("The password is strong.")
else:
    print("The password is not strong.")
