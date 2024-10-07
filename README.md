# ShiftCipher

The **Shift Cipher**, also known as the **Caesar Cipher**, is a type of substitution cipher where each letter in the plaintext is shifted by a certain number of positions down or up the alphabet based on a key. This encryption method is simple yet effective for obfuscating text.

## Features:
1. **Encryption**:
   - The cipher shifts each letter of the plaintext by a specified key value.
   - Uppercase and lowercase letters are shifted independently.
   - Non-alphabetic characters remain unchanged.

2. **Decryption**:
   - The decryption process reverses the shift applied during encryption using the same key value.
   
## How it Works:
- **Encryption**: For each letter in the plaintext:
  - If it's an uppercase letter, it is shifted within the range of 'A' to 'Z'.
  - If it's a lowercase letter, it is shifted within the range of 'a' to 'z'.
  - Non-alphabetic characters (such as punctuation) are not modified.

- **Decryption**: For each letter in the ciphertext, the reverse of the shift applied during encryption is performed using the same key to retrieve the original message.

## Example:
- **Plaintext**: `HELLO WORLD`
- **Key**: `3`
- **Ciphertext**: `KHOOR ZRUOG`

## How to Use:

1. **Run the Program**:
   - The program offers a choice between encryption and decryption.
   - For encryption, enter the plaintext and the key.
   - For decryption, enter the ciphertext and the key.

2. **Input**:
   - Plaintext or ciphertext string (depending on the operation).
   - A key (integer) that indicates the shift value.

3. **Output**:
   - Encrypted text if encryption is chosen.
   - Decrypted text if decryption is chosen.

## Sample Execution:

```text
Shift cipher encryption and decryption
Enter 1 for encryption and 2 for decryption
1
Enter the plain text to obtain cipher text:
HELLO
Enter the key value:
3
The resulting cipher text after encrypting is: KHOOR
Shift cipher encryption and decryption
Enter 1 for encryption and 2 for decryption
2
Enter the cipher text to obtain plain text:
KHOOR
Enter the key value:
3
The resulting plain text after decrypting is: HELLO
