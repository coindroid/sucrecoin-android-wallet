package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author main@m42.cx
 */
public class SucrecoinMain extends BitFamily {
    private SucrecoinMain() {
        id = "sucrecoin.main"; // Do not change this id as wallets serialize this string



        addressHeader = 75;
        p2shHeader = 122;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 128;

        name = "Sucrecoin";
        symbol = "XSR";
        uriScheme = "sucrecoin";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(50000);
        minNonDust = value(1000); // 0.00001 DASH mininput
        softDustLimit = value(5000); // 0.001 DASH
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Sucrecoin Signed Message:\n");

    }

    private static SucrecoinMain instance = new SucrecoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
