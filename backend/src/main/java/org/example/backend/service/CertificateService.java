package org.example.backend.service;

import org.example.backend.dto.CertificateDTO;
import org.springframework.stereotype.Service;
import org.web3j.model.CertificateRegistry;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple3;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.StaticGasProvider;

import java.math.BigInteger;

@Service
public class CertificateService {
    private final CertificateRegistry contract;


    public CertificateService(BlockChainService blockchainService) {
        ContractGasProvider gasProvider=new StaticGasProvider(BigInteger.ZERO,BigInteger.valueOf(3000000));
        this.contract=CertificateRegistry.load("",blockchainService.getWeb3j(),blockchainService.getCredentials(),gasProvider);
    }

    public String issueCertificate(String studentId,String studentName,String course) throws Exception {
        TransactionReceipt receipt=contract.issueCertificate(studentId,studentName,course).send();
        return receipt.getTransactionHash();
    }
    public CertificateDTO verifyCertificate(String studentId) throws Exception {
        Tuple3<String, String, BigInteger> result = contract.verifyCertificate(studentId).send();
        return new CertificateDTO(result.component1(), result.component2(), result.component3().longValue());
    }

}
