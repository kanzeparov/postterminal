//package com.example.kanzeparovrr.postterminalcardapplicationmir.contracts;
//
//
//import java.math.BigInteger;
//import java.util.Arrays;
//import java.util.Collections;
//import org.web3j.abi.FunctionEncoder;
//import org.web3j.abi.TypeReference;
//import org.web3j.abi.datatypes.Function;
//import org.web3j.abi.datatypes.Type;
//import org.web3j.abi.datatypes.Utf8String;
//import org.web3j.crypto.Credentials;
//import org.web3j.protocol.Web3j;
//import org.web3j.protocol.core.RemoteCall;
//import org.web3j.protocol.core.methods.response.TransactionReceipt;
//import org.web3j.tx.Contract;
//import org.web3j.tx.TransactionManager;
//
//public class CryptoAnchors extends Contract {
//    private static final String BINARY =
//            "608060405234801561001057600080fd5b5060405161057d38038061057d83398101604052805160008054600160a060020a03191633600160a060020a031617905501805161005590600190602084019061005c565b50506100f7565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061009d57805160ff19168380011785556100ca565b828001600101855582156100ca579182015b828111156100ca5782518255916020019190600101906100af565b506100d69291506100da565b5090565b6100f491905b808211156100d657600081556001016100e0565b90565b610477806101066000396000f3006080604052600436106100565763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166305aa48f1811461005b578063515dbdec1461007e578063bf00765314610108575b600080fd5b34801561006757600080fd5b5061007c600160a060020a0360043516610190565b005b34801561008a57600080fd5b506100936101e2565b6040805160208082528351818301528351919283929083019185019080838360005b838110156100cd5781810151838201526020016100b5565b50505050905090810190601f1680156100fa5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561011457600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261007c94369492936024939284019190819084018382808284375094975050843595505050602083013592604081013560ff1692506060810135915060808101359060a08101359060c00135600160a060020a0316610278565b60005433600160a060020a039081169116146101ab57600080fd5b600160a060020a03166000818152600260205260409020805473ffffffffffffffffffffffffffffffffffffffff19169091179055565b60018054604080516020601f6002600019610100878916150201909516949094049384018190048102820181019092528281526060939092909183018282801561026d5780601f106102425761010080835404028352916020019161026d565b820191906000526020600020905b81548152906001019060200180831161025057829003601f168201915b505050505090505b90565b604080516000808252602080830180855286905260ff89168385015260608301889052608083018790529251600160a060020a0385169360019360a0808201949293601f198101939281900390910191865af11580156102dc573d6000803e3d6000fd5b50505060206040510351600160a060020a03161415156102fb57600080fd5b600160a060020a038082166000818152600260205260409020549091161461032257600080fd5b600160a060020a038181166000908152600360209081526040808320805473ffffffffffffffffffffffffffffffffffffffff19163390951694909417909355600481529190208951610377928b01906103b3565b50600160a060020a0316600090815260056020908152604080832098909855600681528782209690965560079095525050509190204290555050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106103f457805160ff1916838001178555610421565b82800160010185558215610421579182015b82811115610421578251825591602001919060010190610406565b5061042d929150610431565b5090565b61027591905b8082111561042d57600081556001016104375600a165627a7a7230582098ba94af594b3cf2bfc70f11360cc917e676451085f8ec7a0503470b28f75b3b0029";
//
//    protected CryptoAnchors(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
//        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
//    }
//
//    protected CryptoAnchors(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
//        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
//    }
//
//    public RemoteCall<TransactionReceipt> AddUnit(String _key) {
//        final Function function = new Function(
//                "AddUnit",
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_key)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public RemoteCall<String> TypeName() {
//        final Function function = new Function("TypeName",
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {
//                }));
//        return executeRemoteCallSingleValueReturn(function, String.class);
//    }
//
//    public RemoteCall<TransactionReceipt> UpdateState(String _status, BigInteger _latitude, BigInteger _longitude, BigInteger v, byte[] r, byte[] s,
//            byte[] signedHash, String UnitId) {
//        final Function function = new Function(
//                "UpdateState",
//                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_status),
//                        new org.web3j.abi.datatypes.generated.Uint256(_latitude),
//                        new org.web3j.abi.datatypes.generated.Uint256(_longitude),
//                        new org.web3j.abi.datatypes.generated.Uint8(v),
//                        new org.web3j.abi.datatypes.generated.Bytes32(r),
//                        new org.web3j.abi.datatypes.generated.Bytes32(s),
//                        new org.web3j.abi.datatypes.generated.Bytes32(signedHash),
//                        new org.web3j.abi.datatypes.Address(UnitId)),
//                Collections.<TypeReference<?>>emptyList());
//        return executeRemoteCallTransaction(function);
//    }
//
//    public static RemoteCall<CryptoAnchors> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _name_type) {
//        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name_type)));
//        return deployRemoteCall(CryptoAnchors.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
//    }
//
//    public static RemoteCall<CryptoAnchors> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit,
//            String _name_type) {
//        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name_type)));
//        return deployRemoteCall(CryptoAnchors.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
//    }
//
//    public static CryptoAnchors load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
//        return new CryptoAnchors(contractAddress, web3j, credentials, gasPrice, gasLimit);
//    }
//
//    public static CryptoAnchors load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
//        return new CryptoAnchors(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
//    }
//}
//
