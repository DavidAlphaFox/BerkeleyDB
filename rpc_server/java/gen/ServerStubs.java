/*
 * Automatically generated by jrpcgen 0.95.1 on 8/2/05 1:49 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
package com.sleepycat.db.rpcserver;
import org.acplt.oncrpc.*;
import java.io.IOException;

import org.acplt.oncrpc.server.*;

/**
 */
public abstract class ServerStubs extends OncRpcServerStub implements OncRpcDispatchable {

    public ServerStubs()
           throws OncRpcException, IOException {
        this(0);
    }

    public ServerStubs(int port)
           throws OncRpcException, IOException {
        info = new OncRpcServerTransportRegistrationInfo [] {
            new OncRpcServerTransportRegistrationInfo(db_server.DB_RPC_SERVERPROG, 4004),
        };
        transports = new OncRpcServerTransport [] {
            new OncRpcUdpServerTransport(this, port, info, 32768),
            new OncRpcTcpServerTransport(this, port, info, 32768)
        };
    }

    public void dispatchOncRpcCall(OncRpcCallInformation call, int program, int version, int procedure)
           throws OncRpcException, IOException {
        if ( version == 4004 ) {
            switch ( procedure ) {
            case 1: {
                __env_create_msg args$ = new __env_create_msg();
                call.retrieveCall(args$);
                __env_create_reply result$ = __DB_env_create_4004(args$);
                call.reply(result$);
                break;
            }
            case 2: {
                __env_close_msg args$ = new __env_close_msg();
                call.retrieveCall(args$);
                __env_close_reply result$ = __DB_env_close_4004(args$);
                call.reply(result$);
                break;
            }
            case 3: {
                __env_dbremove_msg args$ = new __env_dbremove_msg();
                call.retrieveCall(args$);
                __env_dbremove_reply result$ = __DB_env_dbremove_4004(args$);
                call.reply(result$);
                break;
            }
            case 4: {
                __env_dbrename_msg args$ = new __env_dbrename_msg();
                call.retrieveCall(args$);
                __env_dbrename_reply result$ = __DB_env_dbrename_4004(args$);
                call.reply(result$);
                break;
            }
            case 5: {
                __env_get_cachesize_msg args$ = new __env_get_cachesize_msg();
                call.retrieveCall(args$);
                __env_get_cachesize_reply result$ = __DB_env_get_cachesize_4004(args$);
                call.reply(result$);
                break;
            }
            case 6: {
                __env_get_encrypt_flags_msg args$ = new __env_get_encrypt_flags_msg();
                call.retrieveCall(args$);
                __env_get_encrypt_flags_reply result$ = __DB_env_get_encrypt_flags_4004(args$);
                call.reply(result$);
                break;
            }
            case 7: {
                __env_get_flags_msg args$ = new __env_get_flags_msg();
                call.retrieveCall(args$);
                __env_get_flags_reply result$ = __DB_env_get_flags_4004(args$);
                call.reply(result$);
                break;
            }
            case 8: {
                __env_get_home_msg args$ = new __env_get_home_msg();
                call.retrieveCall(args$);
                __env_get_home_reply result$ = __DB_env_get_home_4004(args$);
                call.reply(result$);
                break;
            }
            case 9: {
                __env_get_open_flags_msg args$ = new __env_get_open_flags_msg();
                call.retrieveCall(args$);
                __env_get_open_flags_reply result$ = __DB_env_get_open_flags_4004(args$);
                call.reply(result$);
                break;
            }
            case 10: {
                __env_open_msg args$ = new __env_open_msg();
                call.retrieveCall(args$);
                __env_open_reply result$ = __DB_env_open_4004(args$);
                call.reply(result$);
                break;
            }
            case 11: {
                __env_remove_msg args$ = new __env_remove_msg();
                call.retrieveCall(args$);
                __env_remove_reply result$ = __DB_env_remove_4004(args$);
                call.reply(result$);
                break;
            }
            case 12: {
                __env_set_cachesize_msg args$ = new __env_set_cachesize_msg();
                call.retrieveCall(args$);
                __env_set_cachesize_reply result$ = __DB_env_set_cachesize_4004(args$);
                call.reply(result$);
                break;
            }
            case 13: {
                __env_set_encrypt_msg args$ = new __env_set_encrypt_msg();
                call.retrieveCall(args$);
                __env_set_encrypt_reply result$ = __DB_env_set_encrypt_4004(args$);
                call.reply(result$);
                break;
            }
            case 14: {
                __env_set_flags_msg args$ = new __env_set_flags_msg();
                call.retrieveCall(args$);
                __env_set_flags_reply result$ = __DB_env_set_flags_4004(args$);
                call.reply(result$);
                break;
            }
            case 15: {
                __env_txn_begin_msg args$ = new __env_txn_begin_msg();
                call.retrieveCall(args$);
                __env_txn_begin_reply result$ = __DB_env_txn_begin_4004(args$);
                call.reply(result$);
                break;
            }
            case 16: {
                __env_txn_recover_msg args$ = new __env_txn_recover_msg();
                call.retrieveCall(args$);
                __env_txn_recover_reply result$ = __DB_env_txn_recover_4004(args$);
                call.reply(result$);
                break;
            }
            case 17: {
                __db_create_msg args$ = new __db_create_msg();
                call.retrieveCall(args$);
                __db_create_reply result$ = __DB_db_create_4004(args$);
                call.reply(result$);
                break;
            }
            case 18: {
                __db_associate_msg args$ = new __db_associate_msg();
                call.retrieveCall(args$);
                __db_associate_reply result$ = __DB_db_associate_4004(args$);
                call.reply(result$);
                break;
            }
            case 19: {
                __db_close_msg args$ = new __db_close_msg();
                call.retrieveCall(args$);
                __db_close_reply result$ = __DB_db_close_4004(args$);
                call.reply(result$);
                break;
            }
            case 20: {
                __db_cursor_msg args$ = new __db_cursor_msg();
                call.retrieveCall(args$);
                __db_cursor_reply result$ = __DB_db_cursor_4004(args$);
                call.reply(result$);
                break;
            }
            case 21: {
                __db_del_msg args$ = new __db_del_msg();
                call.retrieveCall(args$);
                __db_del_reply result$ = __DB_db_del_4004(args$);
                call.reply(result$);
                break;
            }
            case 22: {
                __db_get_msg args$ = new __db_get_msg();
                call.retrieveCall(args$);
                __db_get_reply result$ = __DB_db_get_4004(args$);
                call.reply(result$);
                break;
            }
            case 23: {
                __db_get_bt_minkey_msg args$ = new __db_get_bt_minkey_msg();
                call.retrieveCall(args$);
                __db_get_bt_minkey_reply result$ = __DB_db_get_bt_minkey_4004(args$);
                call.reply(result$);
                break;
            }
            case 24: {
                __db_get_dbname_msg args$ = new __db_get_dbname_msg();
                call.retrieveCall(args$);
                __db_get_dbname_reply result$ = __DB_db_get_dbname_4004(args$);
                call.reply(result$);
                break;
            }
            case 25: {
                __db_get_encrypt_flags_msg args$ = new __db_get_encrypt_flags_msg();
                call.retrieveCall(args$);
                __db_get_encrypt_flags_reply result$ = __DB_db_get_encrypt_flags_4004(args$);
                call.reply(result$);
                break;
            }
            case 26: {
                __db_get_flags_msg args$ = new __db_get_flags_msg();
                call.retrieveCall(args$);
                __db_get_flags_reply result$ = __DB_db_get_flags_4004(args$);
                call.reply(result$);
                break;
            }
            case 27: {
                __db_get_h_ffactor_msg args$ = new __db_get_h_ffactor_msg();
                call.retrieveCall(args$);
                __db_get_h_ffactor_reply result$ = __DB_db_get_h_ffactor_4004(args$);
                call.reply(result$);
                break;
            }
            case 28: {
                __db_get_h_nelem_msg args$ = new __db_get_h_nelem_msg();
                call.retrieveCall(args$);
                __db_get_h_nelem_reply result$ = __DB_db_get_h_nelem_4004(args$);
                call.reply(result$);
                break;
            }
            case 29: {
                __db_get_lorder_msg args$ = new __db_get_lorder_msg();
                call.retrieveCall(args$);
                __db_get_lorder_reply result$ = __DB_db_get_lorder_4004(args$);
                call.reply(result$);
                break;
            }
            case 30: {
                __db_get_open_flags_msg args$ = new __db_get_open_flags_msg();
                call.retrieveCall(args$);
                __db_get_open_flags_reply result$ = __DB_db_get_open_flags_4004(args$);
                call.reply(result$);
                break;
            }
            case 31: {
                __db_get_pagesize_msg args$ = new __db_get_pagesize_msg();
                call.retrieveCall(args$);
                __db_get_pagesize_reply result$ = __DB_db_get_pagesize_4004(args$);
                call.reply(result$);
                break;
            }
            case 32: {
                __db_get_q_extentsize_msg args$ = new __db_get_q_extentsize_msg();
                call.retrieveCall(args$);
                __db_get_q_extentsize_reply result$ = __DB_db_get_q_extentsize_4004(args$);
                call.reply(result$);
                break;
            }
            case 33: {
                __db_get_re_delim_msg args$ = new __db_get_re_delim_msg();
                call.retrieveCall(args$);
                __db_get_re_delim_reply result$ = __DB_db_get_re_delim_4004(args$);
                call.reply(result$);
                break;
            }
            case 34: {
                __db_get_re_len_msg args$ = new __db_get_re_len_msg();
                call.retrieveCall(args$);
                __db_get_re_len_reply result$ = __DB_db_get_re_len_4004(args$);
                call.reply(result$);
                break;
            }
            case 35: {
                __db_get_re_pad_msg args$ = new __db_get_re_pad_msg();
                call.retrieveCall(args$);
                __db_get_re_pad_reply result$ = __DB_db_get_re_pad_4004(args$);
                call.reply(result$);
                break;
            }
            case 36: {
                __db_join_msg args$ = new __db_join_msg();
                call.retrieveCall(args$);
                __db_join_reply result$ = __DB_db_join_4004(args$);
                call.reply(result$);
                break;
            }
            case 37: {
                __db_key_range_msg args$ = new __db_key_range_msg();
                call.retrieveCall(args$);
                __db_key_range_reply result$ = __DB_db_key_range_4004(args$);
                call.reply(result$);
                break;
            }
            case 38: {
                __db_open_msg args$ = new __db_open_msg();
                call.retrieveCall(args$);
                __db_open_reply result$ = __DB_db_open_4004(args$);
                call.reply(result$);
                break;
            }
            case 39: {
                __db_pget_msg args$ = new __db_pget_msg();
                call.retrieveCall(args$);
                __db_pget_reply result$ = __DB_db_pget_4004(args$);
                call.reply(result$);
                break;
            }
            case 40: {
                __db_put_msg args$ = new __db_put_msg();
                call.retrieveCall(args$);
                __db_put_reply result$ = __DB_db_put_4004(args$);
                call.reply(result$);
                break;
            }
            case 41: {
                __db_remove_msg args$ = new __db_remove_msg();
                call.retrieveCall(args$);
                __db_remove_reply result$ = __DB_db_remove_4004(args$);
                call.reply(result$);
                break;
            }
            case 42: {
                __db_rename_msg args$ = new __db_rename_msg();
                call.retrieveCall(args$);
                __db_rename_reply result$ = __DB_db_rename_4004(args$);
                call.reply(result$);
                break;
            }
            case 43: {
                __db_set_bt_minkey_msg args$ = new __db_set_bt_minkey_msg();
                call.retrieveCall(args$);
                __db_set_bt_minkey_reply result$ = __DB_db_set_bt_minkey_4004(args$);
                call.reply(result$);
                break;
            }
            case 44: {
                __db_set_encrypt_msg args$ = new __db_set_encrypt_msg();
                call.retrieveCall(args$);
                __db_set_encrypt_reply result$ = __DB_db_set_encrypt_4004(args$);
                call.reply(result$);
                break;
            }
            case 45: {
                __db_set_flags_msg args$ = new __db_set_flags_msg();
                call.retrieveCall(args$);
                __db_set_flags_reply result$ = __DB_db_set_flags_4004(args$);
                call.reply(result$);
                break;
            }
            case 46: {
                __db_set_h_ffactor_msg args$ = new __db_set_h_ffactor_msg();
                call.retrieveCall(args$);
                __db_set_h_ffactor_reply result$ = __DB_db_set_h_ffactor_4004(args$);
                call.reply(result$);
                break;
            }
            case 47: {
                __db_set_h_nelem_msg args$ = new __db_set_h_nelem_msg();
                call.retrieveCall(args$);
                __db_set_h_nelem_reply result$ = __DB_db_set_h_nelem_4004(args$);
                call.reply(result$);
                break;
            }
            case 48: {
                __db_set_lorder_msg args$ = new __db_set_lorder_msg();
                call.retrieveCall(args$);
                __db_set_lorder_reply result$ = __DB_db_set_lorder_4004(args$);
                call.reply(result$);
                break;
            }
            case 49: {
                __db_set_pagesize_msg args$ = new __db_set_pagesize_msg();
                call.retrieveCall(args$);
                __db_set_pagesize_reply result$ = __DB_db_set_pagesize_4004(args$);
                call.reply(result$);
                break;
            }
            case 50: {
                __db_set_q_extentsize_msg args$ = new __db_set_q_extentsize_msg();
                call.retrieveCall(args$);
                __db_set_q_extentsize_reply result$ = __DB_db_set_q_extentsize_4004(args$);
                call.reply(result$);
                break;
            }
            case 51: {
                __db_set_re_delim_msg args$ = new __db_set_re_delim_msg();
                call.retrieveCall(args$);
                __db_set_re_delim_reply result$ = __DB_db_set_re_delim_4004(args$);
                call.reply(result$);
                break;
            }
            case 52: {
                __db_set_re_len_msg args$ = new __db_set_re_len_msg();
                call.retrieveCall(args$);
                __db_set_re_len_reply result$ = __DB_db_set_re_len_4004(args$);
                call.reply(result$);
                break;
            }
            case 53: {
                __db_set_re_pad_msg args$ = new __db_set_re_pad_msg();
                call.retrieveCall(args$);
                __db_set_re_pad_reply result$ = __DB_db_set_re_pad_4004(args$);
                call.reply(result$);
                break;
            }
            case 54: {
                __db_stat_msg args$ = new __db_stat_msg();
                call.retrieveCall(args$);
                __db_stat_reply result$ = __DB_db_stat_4004(args$);
                call.reply(result$);
                break;
            }
            case 55: {
                __db_sync_msg args$ = new __db_sync_msg();
                call.retrieveCall(args$);
                __db_sync_reply result$ = __DB_db_sync_4004(args$);
                call.reply(result$);
                break;
            }
            case 56: {
                __db_truncate_msg args$ = new __db_truncate_msg();
                call.retrieveCall(args$);
                __db_truncate_reply result$ = __DB_db_truncate_4004(args$);
                call.reply(result$);
                break;
            }
            case 57: {
                __dbc_c_close_msg args$ = new __dbc_c_close_msg();
                call.retrieveCall(args$);
                __dbc_c_close_reply result$ = __DB_dbc_c_close_4004(args$);
                call.reply(result$);
                break;
            }
            case 58: {
                __dbc_c_count_msg args$ = new __dbc_c_count_msg();
                call.retrieveCall(args$);
                __dbc_c_count_reply result$ = __DB_dbc_c_count_4004(args$);
                call.reply(result$);
                break;
            }
            case 59: {
                __dbc_c_del_msg args$ = new __dbc_c_del_msg();
                call.retrieveCall(args$);
                __dbc_c_del_reply result$ = __DB_dbc_c_del_4004(args$);
                call.reply(result$);
                break;
            }
            case 60: {
                __dbc_c_dup_msg args$ = new __dbc_c_dup_msg();
                call.retrieveCall(args$);
                __dbc_c_dup_reply result$ = __DB_dbc_c_dup_4004(args$);
                call.reply(result$);
                break;
            }
            case 61: {
                __dbc_c_get_msg args$ = new __dbc_c_get_msg();
                call.retrieveCall(args$);
                __dbc_c_get_reply result$ = __DB_dbc_c_get_4004(args$);
                call.reply(result$);
                break;
            }
            case 62: {
                __dbc_c_pget_msg args$ = new __dbc_c_pget_msg();
                call.retrieveCall(args$);
                __dbc_c_pget_reply result$ = __DB_dbc_c_pget_4004(args$);
                call.reply(result$);
                break;
            }
            case 63: {
                __dbc_c_put_msg args$ = new __dbc_c_put_msg();
                call.retrieveCall(args$);
                __dbc_c_put_reply result$ = __DB_dbc_c_put_4004(args$);
                call.reply(result$);
                break;
            }
            case 64: {
                __txn_abort_msg args$ = new __txn_abort_msg();
                call.retrieveCall(args$);
                __txn_abort_reply result$ = __DB_txn_abort_4004(args$);
                call.reply(result$);
                break;
            }
            case 65: {
                __txn_commit_msg args$ = new __txn_commit_msg();
                call.retrieveCall(args$);
                __txn_commit_reply result$ = __DB_txn_commit_4004(args$);
                call.reply(result$);
                break;
            }
            case 66: {
                __txn_discard_msg args$ = new __txn_discard_msg();
                call.retrieveCall(args$);
                __txn_discard_reply result$ = __DB_txn_discard_4004(args$);
                call.reply(result$);
                break;
            }
            case 67: {
                __txn_prepare_msg args$ = new __txn_prepare_msg();
                call.retrieveCall(args$);
                __txn_prepare_reply result$ = __DB_txn_prepare_4004(args$);
                call.reply(result$);
                break;
            }
            default:
                call.failProcedureUnavailable();
            }
        } else {
            call.failProcedureUnavailable();
        }
    }

    public abstract __env_create_reply __DB_env_create_4004(__env_create_msg arg1);

    public abstract __env_close_reply __DB_env_close_4004(__env_close_msg arg1);

    public abstract __env_dbremove_reply __DB_env_dbremove_4004(__env_dbremove_msg arg1);

    public abstract __env_dbrename_reply __DB_env_dbrename_4004(__env_dbrename_msg arg1);

    public abstract __env_get_cachesize_reply __DB_env_get_cachesize_4004(__env_get_cachesize_msg arg1);

    public abstract __env_get_encrypt_flags_reply __DB_env_get_encrypt_flags_4004(__env_get_encrypt_flags_msg arg1);

    public abstract __env_get_flags_reply __DB_env_get_flags_4004(__env_get_flags_msg arg1);

    public abstract __env_get_home_reply __DB_env_get_home_4004(__env_get_home_msg arg1);

    public abstract __env_get_open_flags_reply __DB_env_get_open_flags_4004(__env_get_open_flags_msg arg1);

    public abstract __env_open_reply __DB_env_open_4004(__env_open_msg arg1);

    public abstract __env_remove_reply __DB_env_remove_4004(__env_remove_msg arg1);

    public abstract __env_set_cachesize_reply __DB_env_set_cachesize_4004(__env_set_cachesize_msg arg1);

    public abstract __env_set_encrypt_reply __DB_env_set_encrypt_4004(__env_set_encrypt_msg arg1);

    public abstract __env_set_flags_reply __DB_env_set_flags_4004(__env_set_flags_msg arg1);

    public abstract __env_txn_begin_reply __DB_env_txn_begin_4004(__env_txn_begin_msg arg1);

    public abstract __env_txn_recover_reply __DB_env_txn_recover_4004(__env_txn_recover_msg arg1);

    public abstract __db_create_reply __DB_db_create_4004(__db_create_msg arg1);

    public abstract __db_associate_reply __DB_db_associate_4004(__db_associate_msg arg1);

    public abstract __db_close_reply __DB_db_close_4004(__db_close_msg arg1);

    public abstract __db_cursor_reply __DB_db_cursor_4004(__db_cursor_msg arg1);

    public abstract __db_del_reply __DB_db_del_4004(__db_del_msg arg1);

    public abstract __db_get_reply __DB_db_get_4004(__db_get_msg arg1);

    public abstract __db_get_bt_minkey_reply __DB_db_get_bt_minkey_4004(__db_get_bt_minkey_msg arg1);

    public abstract __db_get_dbname_reply __DB_db_get_dbname_4004(__db_get_dbname_msg arg1);

    public abstract __db_get_encrypt_flags_reply __DB_db_get_encrypt_flags_4004(__db_get_encrypt_flags_msg arg1);

    public abstract __db_get_flags_reply __DB_db_get_flags_4004(__db_get_flags_msg arg1);

    public abstract __db_get_h_ffactor_reply __DB_db_get_h_ffactor_4004(__db_get_h_ffactor_msg arg1);

    public abstract __db_get_h_nelem_reply __DB_db_get_h_nelem_4004(__db_get_h_nelem_msg arg1);

    public abstract __db_get_lorder_reply __DB_db_get_lorder_4004(__db_get_lorder_msg arg1);

    public abstract __db_get_open_flags_reply __DB_db_get_open_flags_4004(__db_get_open_flags_msg arg1);

    public abstract __db_get_pagesize_reply __DB_db_get_pagesize_4004(__db_get_pagesize_msg arg1);

    public abstract __db_get_q_extentsize_reply __DB_db_get_q_extentsize_4004(__db_get_q_extentsize_msg arg1);

    public abstract __db_get_re_delim_reply __DB_db_get_re_delim_4004(__db_get_re_delim_msg arg1);

    public abstract __db_get_re_len_reply __DB_db_get_re_len_4004(__db_get_re_len_msg arg1);

    public abstract __db_get_re_pad_reply __DB_db_get_re_pad_4004(__db_get_re_pad_msg arg1);

    public abstract __db_join_reply __DB_db_join_4004(__db_join_msg arg1);

    public abstract __db_key_range_reply __DB_db_key_range_4004(__db_key_range_msg arg1);

    public abstract __db_open_reply __DB_db_open_4004(__db_open_msg arg1);

    public abstract __db_pget_reply __DB_db_pget_4004(__db_pget_msg arg1);

    public abstract __db_put_reply __DB_db_put_4004(__db_put_msg arg1);

    public abstract __db_remove_reply __DB_db_remove_4004(__db_remove_msg arg1);

    public abstract __db_rename_reply __DB_db_rename_4004(__db_rename_msg arg1);

    public abstract __db_set_bt_minkey_reply __DB_db_set_bt_minkey_4004(__db_set_bt_minkey_msg arg1);

    public abstract __db_set_encrypt_reply __DB_db_set_encrypt_4004(__db_set_encrypt_msg arg1);

    public abstract __db_set_flags_reply __DB_db_set_flags_4004(__db_set_flags_msg arg1);

    public abstract __db_set_h_ffactor_reply __DB_db_set_h_ffactor_4004(__db_set_h_ffactor_msg arg1);

    public abstract __db_set_h_nelem_reply __DB_db_set_h_nelem_4004(__db_set_h_nelem_msg arg1);

    public abstract __db_set_lorder_reply __DB_db_set_lorder_4004(__db_set_lorder_msg arg1);

    public abstract __db_set_pagesize_reply __DB_db_set_pagesize_4004(__db_set_pagesize_msg arg1);

    public abstract __db_set_q_extentsize_reply __DB_db_set_q_extentsize_4004(__db_set_q_extentsize_msg arg1);

    public abstract __db_set_re_delim_reply __DB_db_set_re_delim_4004(__db_set_re_delim_msg arg1);

    public abstract __db_set_re_len_reply __DB_db_set_re_len_4004(__db_set_re_len_msg arg1);

    public abstract __db_set_re_pad_reply __DB_db_set_re_pad_4004(__db_set_re_pad_msg arg1);

    public abstract __db_stat_reply __DB_db_stat_4004(__db_stat_msg arg1);

    public abstract __db_sync_reply __DB_db_sync_4004(__db_sync_msg arg1);

    public abstract __db_truncate_reply __DB_db_truncate_4004(__db_truncate_msg arg1);

    public abstract __dbc_c_close_reply __DB_dbc_c_close_4004(__dbc_c_close_msg arg1);

    public abstract __dbc_c_count_reply __DB_dbc_c_count_4004(__dbc_c_count_msg arg1);

    public abstract __dbc_c_del_reply __DB_dbc_c_del_4004(__dbc_c_del_msg arg1);

    public abstract __dbc_c_dup_reply __DB_dbc_c_dup_4004(__dbc_c_dup_msg arg1);

    public abstract __dbc_c_get_reply __DB_dbc_c_get_4004(__dbc_c_get_msg arg1);

    public abstract __dbc_c_pget_reply __DB_dbc_c_pget_4004(__dbc_c_pget_msg arg1);

    public abstract __dbc_c_put_reply __DB_dbc_c_put_4004(__dbc_c_put_msg arg1);

    public abstract __txn_abort_reply __DB_txn_abort_4004(__txn_abort_msg arg1);

    public abstract __txn_commit_reply __DB_txn_commit_4004(__txn_commit_msg arg1);

    public abstract __txn_discard_reply __DB_txn_discard_4004(__txn_discard_msg arg1);

    public abstract __txn_prepare_reply __DB_txn_prepare_4004(__txn_prepare_msg arg1);

}
// End of ServerStubs.java
