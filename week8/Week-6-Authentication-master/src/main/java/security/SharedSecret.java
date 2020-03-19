/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.security.SecureRandom;


/**
 *
 * @author AKA
 */
public class SharedSecret {
    //                           REMOVE IN PRODUCTION!!!
    private static byte[] secret = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA".getBytes();
    public static byte[] getKey() {
        if (secret == null) {
            secret = new byte[32];
            new SecureRandom().nextBytes(secret);
            }
        return secret;
        }
    }
