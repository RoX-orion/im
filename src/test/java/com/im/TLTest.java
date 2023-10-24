package com.im;

import com.im.lib.tl.TLHelpers;
import org.junit.Test;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-16
 */

public class TLTest {
    @Test
    public void crc32() {
        /**
         * dialog#d58a08c6 flags:#
         *
         * pinned:flags.2?true
         * unread_mark:flags.3?true
         * peer:Peer
         * top_message:int
         * read_inbox_max_id:int
         * read_outbox_max_id:int
         * unread_count:int
         * unread_mentions_count:int
         * unread_reactions_count:int
         * notify_settings:PeerNotifySettings
         * pts:flags.0?int
         * draft:flags.1?DraftMessage
         * folder_id:flags.4?int
         * ttl_period:flags.5?int
         */

        /**
         * chat#41cbf256 flags:#
         *
         * creator:flags.0?true
         * left:flags.2?true
         * deactivated:flags.5?true
         * call_active:flags.23?true
         * call_not_empty:flags.24?true
         * noforwards:flags.25?true
         * id:long
         * title:string
         * photo:ChatPhoto
         * participants_count:int
         * date:int
         * version:int
         * migrated_to:flags.6?InputChannel
         * admin_rights:flags.14?ChatAdminRights
         * default_banned_rights:flags.18?ChatBannedRights
         * = Chat;
         */
        // #75c78e60
        String str = "photoSize type:string w:int h:int size:int = PhotoSize";
        System.out.println(Integer.toHexString(TLHelpers.crc32(str)));
    }

    @Test
    public void checkConstructor() {
        TLHelpers.checkConstructor();
    }
}
