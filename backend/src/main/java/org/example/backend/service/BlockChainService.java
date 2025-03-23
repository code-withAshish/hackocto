package org.example.backend.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Getter
@Service
public class BlockChainService {
private  final Web3j web3j;
private final Credentials credentials;

    public BlockChainService() {
        this.web3j = Web3j.build(new HttpService("http://localhost:8545"));
        this.credentials = Credentials.create("");
    }
}
