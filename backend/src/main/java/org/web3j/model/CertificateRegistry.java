package org.web3j.model;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple3;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/hyperledger-web3j/web3j/tree/main/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.13.0.
 */
@SuppressWarnings("rawtypes")
public class CertificateRegistry extends Contract {
    public static final String BINARY = "6080604052348015600e575f80fd5b506107038061001c5f395ff3fe608060405234801561000f575f80fd5b506004361061003f575f3560e01c80638b23d875146100435780638f2b91ea1461006e578063beec1caa14610081575b5f80fd5b61005661005136600461044d565b610096565b604051610065939291906104b5565b60405180910390f35b61005661007c36600461044d565b610207565b61009461008f3660046104ea565b61033f565b005b6060805f805f856040516100aa9190610578565b90815260200160405180910390206040518060600160405290815f820180546100d29061058e565b80601f01602080910402602001604051908101604052809291908181526020018280546100fe9061058e565b80156101495780601f1061012057610100808354040283529160200191610149565b820191905f5260205f20905b81548152906001019060200180831161012c57829003601f168201915b505050505081526020016001820180546101629061058e565b80601f016020809104026020016040519081016040528092919081815260200182805461018e9061058e565b80156101d95780601f106101b0576101008083540402835291602001916101d9565b820191905f5260205f20905b8154815290600101906020018083116101bc57829003601f168201915b5050509183525050600291909101546020918201528151908201516040909201519097919650945092505050565b80516020818301810180515f8252928201919093012091528054819061022c9061058e565b80601f01602080910402602001604051908101604052809291908181526020018280546102589061058e565b80156102a35780601f1061027a576101008083540402835291602001916102a3565b820191905f5260205f20905b81548152906001019060200180831161028657829003601f168201915b5050505050908060010180546102b89061058e565b80601f01602080910402602001604051908101604052809291908181526020018280546102e49061058e565b801561032f5780601f106103065761010080835404028352916020019161032f565b820191905f5260205f20905b81548152906001019060200180831161031257829003601f168201915b5050505050908060020154905083565b6040518060600160405280838152602001828152602001428152505f846040516103699190610578565b908152604051908190036020019020815181906103869082610612565b506020820151600182019061039b9082610612565b5060408201518160020155905050505050565b634e487b7160e01b5f52604160045260245ffd5b5f82601f8301126103d1575f80fd5b813567ffffffffffffffff8111156103eb576103eb6103ae565b604051601f8201601f19908116603f0116810167ffffffffffffffff8111828210171561041a5761041a6103ae565b604052818152838201602001851015610431575f80fd5b816020850160208301375f918101602001919091529392505050565b5f6020828403121561045d575f80fd5b813567ffffffffffffffff811115610473575f80fd5b61047f848285016103c2565b949350505050565b5f81518084528060208401602086015e5f602082860101526020601f19601f83011685010191505092915050565b606081525f6104c76060830186610487565b82810360208401526104d98186610487565b915050826040830152949350505050565b5f805f606084860312156104fc575f80fd5b833567ffffffffffffffff811115610512575f80fd5b61051e868287016103c2565b935050602084013567ffffffffffffffff81111561053a575f80fd5b610546868287016103c2565b925050604084013567ffffffffffffffff811115610562575f80fd5b61056e868287016103c2565b9150509250925092565b5f82518060208501845e5f920191825250919050565b600181811c908216806105a257607f821691505b6020821081036105c057634e487b7160e01b5f52602260045260245ffd5b50919050565b601f82111561060d57805f5260205f20601f840160051c810160208510156105eb5750805b601f840160051c820191505b8181101561060a575f81556001016105f7565b50505b505050565b815167ffffffffffffffff81111561062c5761062c6103ae565b6106408161063a845461058e565b846105c6565b6020601f821160018114610672575f831561065b5750848201515b5f19600385901b1c1916600184901b17845561060a565b5f84815260208120601f198516915b828110156106a15787850151825560209485019460019092019101610681565b50848210156106be57868401515f19600387901b60f8161c191681555b50505050600190811b0190555056fea26469706673582212208e9bceea89502213dbc62c9a1217743a7feb7fd0a9879a58841eabc710bae6b264736f6c634300081a0033";

    private static String librariesLinkedBinary;

    public static final String FUNC_CERTIFICATES = "certificates";

    public static final String FUNC_ISSUECERTIFICATE = "issueCertificate";

    public static final String FUNC_VERIFYCERTIFICATE = "verifyCertificate";

    @Deprecated
    protected CertificateRegistry(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected CertificateRegistry(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected CertificateRegistry(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected CertificateRegistry(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<Tuple3<String, String, BigInteger>> certificates(String param0) {
        final Function function = new Function(FUNC_CERTIFICATES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple3<String, String, BigInteger>>(function,
                new Callable<Tuple3<String, String, BigInteger>>() {
                    @Override
                    public Tuple3<String, String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<String, String, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> issueCertificate(String studentId,
            String studentName, String course) {
        final Function function = new Function(
                FUNC_ISSUECERTIFICATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(studentId), 
                new org.web3j.abi.datatypes.Utf8String(studentName), 
                new org.web3j.abi.datatypes.Utf8String(course)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Tuple3<String, String, BigInteger>> verifyCertificate(
            String studentId) {
        final Function function = new Function(FUNC_VERIFYCERTIFICATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(studentId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple3<String, String, BigInteger>>(function,
                new Callable<Tuple3<String, String, BigInteger>>() {
                    @Override
                    public Tuple3<String, String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<String, String, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue());
                    }
                });
    }

    @Deprecated
    public static CertificateRegistry load(String contractAddress, Web3j web3j,
            Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new CertificateRegistry(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static CertificateRegistry load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new CertificateRegistry(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static CertificateRegistry load(String contractAddress, Web3j web3j,
            Credentials credentials, ContractGasProvider contractGasProvider) {
        return new CertificateRegistry(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static CertificateRegistry load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new CertificateRegistry(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<CertificateRegistry> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return deployRemoteCall(CertificateRegistry.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), "");
    }

    @Deprecated
    public static RemoteCall<CertificateRegistry> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(CertificateRegistry.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), "");
    }

    public static RemoteCall<CertificateRegistry> deploy(Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(CertificateRegistry.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), "");
    }

    @Deprecated
    public static RemoteCall<CertificateRegistry> deploy(Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(CertificateRegistry.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), "");
    }

    public static void linkLibraries(List<Contract.LinkReference> references) {
        librariesLinkedBinary = linkBinaryWithReferences(BINARY, references);
    }

    private static String getDeploymentBinary() {
        if (librariesLinkedBinary != null) {
            return librariesLinkedBinary;
        } else {
            return BINARY;
        }
    }
}
