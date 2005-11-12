/*
 * Automatically generated by jrpcgen 0.95.1 on 8/2/05 1:49 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
package com.sleepycat.db.rpcserver;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class __txn_prepare_msg implements XdrAble {
    public int txnpcl_id;
    public byte [] gid;

    public __txn_prepare_msg() {
    }

    public __txn_prepare_msg(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeInt(txnpcl_id);
        xdr.xdrEncodeOpaque(gid, 128);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        txnpcl_id = xdr.xdrDecodeInt();
        gid = xdr.xdrDecodeOpaque(128);
    }

}
// End of __txn_prepare_msg.java
