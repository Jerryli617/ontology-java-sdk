/*
 * Copyright (C) 2018 The ontology Authors
 * This file is part of The ontology library.
 *
 *  The ontology is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  The ontology is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with The ontology.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.github.ontio.network.rest;

/**
 * Created by zx on 2018/2/1.
 */
public class Consts {

	public static String Url_send_transaction = "/api/v1/transaction";
	public static String Url_get_transaction = "/api/v1/transaction/";
	public static String Url_get_asset = "/api/v1/asset/";
	public static String Url_get_GenerateBlockTime = "/api/v1/node/generateblocktime";
	public static String Url_get_node_count = "/api/v1/node/connectioncount";
	public static String Url_get_block_height = "/api/v1/block/height";
	public static String Url_get_block_By_Height = "/api/v1/block/details/height/";
	public static String Url_get_block_By_Hash = "/api/v1/block/details/hash/";
	public static String Url_get_account_balance = "/api/v1/balance/";
	public static String Url_get_account_balances = "/api/v1/asset/balances/";
	public static String Url_get_UTXO_By_address_assetid = "/api/v1/asset/utxo/";
	public static String Url_get_UTXO_By_address = "/api/v1/asset/utxos/";
	public static String Url_get_block_height_db = "/blocks/service/blockHeight";
	public static String Url_get_block = "/blocks/service/oneBlockInfo/";
	public static String Url_get_StateUpdate = "/api/v1/stateupdate/";
	public static String Url_get_IdentityUpdate = "/api/v1/identity/";
	public static String Url_get_DDO = "/api/v1/ontid/ddo/";
	public static String Url_get_smartcodeevent_by_height = "/api/v1/smartcode/event/height/";
	public static String Url_get_smartcodeevent_by_txhash = "/api/v1/smartcode/event/txhash/";
}