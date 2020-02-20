package org.password4j.encryption;

/**
 * This interface is intended as an incapsulation
 * of a particular cryptographic hash function.
 */
public interface EncryptionStrategy
{
    
    byte[] encrypt(char[] plain);

}