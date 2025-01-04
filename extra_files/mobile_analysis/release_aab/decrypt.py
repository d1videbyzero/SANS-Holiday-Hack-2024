from cryptography.hazmat.primitives import hashes
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
from cryptography.hazmat.backends import default_backend
import base64
import os

def aes_gcm_decrypt(key_base64, iv_base64, encrypted_data_with_tag_base64):
    # Decode the base64-encoded inputs
    key = base64.b64decode(key_base64)  # Decode the key from base64
    iv = base64.b64decode(iv_base64)    # Decode the IV from base64
    encrypted_data_with_tag = base64.b64decode(encrypted_data_with_tag_base64)  # Decode the encrypted data from base64

    # Extract the ciphertext and authentication tag from the encrypted data
    ciphertext = encrypted_data_with_tag[:-16]  # All but the last 16 bytes are ciphertext
    auth_tag = encrypted_data_with_tag[-16:]  # The last 16 bytes are the authentication tag

    # Create the AES GCM cipher for decryption
    cipher = Cipher(algorithms.AES(key), modes.GCM(iv, auth_tag), backend=default_backend())
    decryptor = cipher.decryptor()

    # Decrypt the data
    decrypted_data = decryptor.update(ciphertext) + decryptor.finalize()

    return decrypted_data

def main():
    # Base64-encoded key (replace with actual base64-encoded key)
    key_base64 = "rmDJ1wJ7ZtKy3lkLs6X9bZ2Jvpt6jL6YWiDsXtgjkXw="

    # Base64-encoded IV (replace with actual base64-encoded IV)
    iv_base64 = "Q2hlY2tNYXRlcml4"

    # Base64-encoded encrypted data with tag (replace with actual base64-encoded encrypted data)
    #encrypted_base64 = "IVrt+9Zct4oUePZeQqFwyhBix8cSCIxtsa+lJZkMNpNFBgoHeJlwp73l2oyEh1Y6AfqnfH7gcU9Yfov6u70cUA2/OwcxVt7Ubdn0UD2kImNsclEQ9M8PpnevBX3mXlW2QnH8+Q+SC7JaMUc9CIvxB2HYQG2JujQf6skpVaPAKGxfLqDj+2UyTAVLoeUlQjc18swZVtTQO7Zwe6sTCYlrw7GpFXCAuI6Ex29gfeVIeB7pK7M4kZGy3OIaFxfTdevCoTMwkoPvJuRupA6ybp36vmLLMXaAWsrDHRUbKfE6UKvGoC9d5vqmKeIO9elASuagxjBJ"
    encrypted_base64 = "KGfb0vd4u/4EWMN0bp035hRjjpMiL4NQurjgHIQHNaRaDnIYbKQ9JusGaa1aAkGEVV8="

    # Decrypt the data
    decrypted_data = aes_gcm_decrypt(key_base64, iv_base64, encrypted_base64)

    print(f"Decrypted Data: {decrypted_data.decode()}")

if __name__ == "__main__":
    main()

