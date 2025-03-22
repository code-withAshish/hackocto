package org.web3j.model;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
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
public class VendingMachine extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b50600080546001600160a01b031916331781553081526001602052604090206064905561038c806100426000396000f3fe60806040526004361061003f5760003560e01c80638da5cb5b14610044578063ca9d07ba14610081578063e18a7b92146100a3578063efef39a1146100de575b600080fd5b34801561005057600080fd5b50600054610064906001600160a01b031681565b6040516001600160a01b0390911681526020015b60405180910390f35b34801561008d57600080fd5b506100a161009c3660046102d9565b6100f1565b005b3480156100af57600080fd5b506100d06100be3660046102a9565b60016020526000908152604090205481565b604051908152602001610078565b6100a16100ec3660046102d9565b610177565b6000546001600160a01b031633146101505760405162461bcd60e51b815260206004820152601a60248201527f4f6e6c7920746865206f776e65722063616e20726566696c6c2e00000000000060448201526064015b60405180910390fd5b306000908152600160205260408120805483929061016f9084906102f2565b909155505050565b61018981670de0b6b3a764000061030a565b3410156101e85760405162461bcd60e51b815260206004820152602760248201527f596f75206d75737420706179206174206c65617374203120455448207065722060448201526663757063616b6560c81b6064820152608401610147565b306000908152600160205260409020548111156102665760405162461bcd60e51b815260206004820152603660248201527f4e6f7420656e6f7567682063757063616b657320696e2073746f636b20746f20604482015275636f6d706c657465207468697320707572636861736560501b6064820152608401610147565b3060009081526001602052604081208054839290610285908490610329565b9091555050336000908152600160205260408120805483929061016f9084906102f2565b6000602082840312156102bb57600080fd5b81356001600160a01b03811681146102d257600080fd5b9392505050565b6000602082840312156102eb57600080fd5b5035919050565b6000821982111561030557610305610340565b500190565b600081600019048311821515161561032457610324610340565b500290565b60008282101561033b5761033b610340565b500390565b634e487b7160e01b600052601160045260246000fdfea2646970667358221220629ae447ac64ff50d96c9f24af2524fb29086eef4ddab69396c210687084b7c664736f6c63430008070033";

    private static String librariesLinkedBinary;

    public static final String FUNC_CUPCAKEBALANCES = "cupcakeBalances";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_PURCHASE = "purchase";

    public static final String FUNC_REFILL = "refill";

    @Deprecated
    protected VendingMachine(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected VendingMachine(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected VendingMachine(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected VendingMachine(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> cupcakeBalances(String param0) {
        final Function function = new Function(FUNC_CUPCAKEBALANCES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> owner() {
        final Function function = new Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> purchase(BigInteger amount, BigInteger weiValue) {
        final Function function = new Function(
                FUNC_PURCHASE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteFunctionCall<TransactionReceipt> refill(BigInteger amount) {
        final Function function = new Function(
                FUNC_REFILL, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static VendingMachine load(String contractAddress, Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return new VendingMachine(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static VendingMachine load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new VendingMachine(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static VendingMachine load(String contractAddress, Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return new VendingMachine(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static VendingMachine load(String contractAddress, Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new VendingMachine(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<VendingMachine> deploy(Web3j web3j, Credentials credentials,
            ContractGasProvider contractGasProvider) {
        return deployRemoteCall(VendingMachine.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), "");
    }

    public static RemoteCall<VendingMachine> deploy(Web3j web3j,
            TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(VendingMachine.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), "");
    }

    @Deprecated
    public static RemoteCall<VendingMachine> deploy(Web3j web3j, Credentials credentials,
            BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(VendingMachine.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), "");
    }

    @Deprecated
    public static RemoteCall<VendingMachine> deploy(Web3j web3j,
            TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(VendingMachine.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), "");
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
