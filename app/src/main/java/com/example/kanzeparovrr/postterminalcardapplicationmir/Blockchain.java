package com.example.kanzeparovrr.postterminalcardapplicationmir;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
//
//import com.example.kanzeparovrr.postterminalcardapplicationmir.contracts.CryptoAnchors;
//
//import org.spongycastle.util.encoders.Hex;
//import org.web3j.crypto.Credentials;
//import org.web3j.protocol.Web3j;
//import org.web3j.protocol.Web3jFactory;
//import org.web3j.protocol.http.HttpService;
//import org.web3j.tx.Contract;
//import org.web3j.tx.ManagedTransaction;

import java.math.BigInteger;

public class Blockchain {

    public static String jsonUTC =
            "{\"version\":3,\"id\":\"c9590b3f-e2eb-4a3f-96d1-0e5dcd304f7c\",\"address\":\"20cf3a494baacae2a74bf81b0e55970b756baa70\",\"Crypto\":{\"ciphertext\":\"650c7e4f2f80ae80426a8e3ea4d1cab891beea3854f010e816d9e2e7d4396984\",\"cipherparams\":{\"iv\":\"110a91cc184227022877ed6b0931cfd1\"},\"cipher\":\"aes-128-ctr\",\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":32,\"salt\":\"ee158b8d1c315b6c6a777bd114896051e4e06e68e506f3df9ba4b556ce89e730\",\"n\":8192,\"r\":8,\"p\":1},\"mac\":\"2cec2b9449980cca057a62cdcd284d499f96a533093c559eb60132af61483747\"}}";

    class MyTask extends AsyncTask<String, Void, Void> {

        @Override
        protected void onPreExecute() {

            super.onPreExecute();

            Log.d("ETHR", "ok pre exec");

        }

        @Override
        protected Void doInBackground(String... params) {

//            try {
//                try {
//                    Web3j web3j = Web3jFactory.build(new HttpService("https://rinkeby.infura.io/1p6X1Vby9WW11tNcTTg0"));
//                    BigInteger _price = BigInteger.ONE;
//                    _price = BigInteger.valueOf(10);
//                        String address = "0xa7d467b39cbb18bd9558037610fdb603c5844d8e";
//                    BigInteger _steps = BigInteger.ONE;
//                    _steps = BigInteger.valueOf(3);
//                    // We then need to load our Ethereum wallet file
//                    // FIXME: Generate a new wallet file using the web3j command line tools https://docs.web3j.io/command_line.html
//                    Credentials credentials1 = Credentials.create("9c215ede75b688ce2f30372140068c815b78b2eedfe8bd9af04d8d7fddd8ef2e");
//                    CryptoAnchors contract1 =
//                            CryptoAnchors.load(address, web3j, credentials1, ManagedTransaction.GAS_PRICE,
//                                    Contract.GAS_LIMIT);
//
//                    Log.d("dw", contract1.TypeName().send());
//
//                    BigInteger _latitude = new BigInteger("123");
//                    BigInteger _longitude = new BigInteger("123");
//                    BigInteger _v = new BigInteger("1c", 16);
//                    byte[] _r = StringHexToByteArray("0xf444a383acba466a2aed2582895c614323bb97aa6b74e04f97922b176bc1aa2c");
//                    byte[] _s = StringHexToByteArray("0x4f23d377cb19cc04f408a2ea4fb219d69e3bcb0a5585d06561a34712185a0e77");
//                    byte[] _signedHash = StringHexToByteArray("0x8dfe9be33ccb1c830e048219729e8c01f54c768004d8dc035105629515feb38e");
//
//                    CryptoAnchors contract = CryptoAnchors.load(
//                            address,
//                            web3j, credentials1,
//                            ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT
//                    );
//
//                    contract.UpdateState(params[0], _latitude, _longitude, _v, _r, _s, _signedHash, address).send();
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }

            return null;
        }

        public byte[] StringHexToByteArray(String x) throws Exception {
//            if (x.startsWith("0x")) {
//                x = x.substring(2);
//            }
//            if (x.length() % 2 != 0) x = "0" + x;
//            return Hex.decode(x);
            return null;
        }
    }
}
