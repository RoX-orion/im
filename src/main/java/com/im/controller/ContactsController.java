package com.im.controller;

import com.im.api.Api;
import com.im.api.ContactsApi;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class ContactsController {

	@WebsocketHandlerMapping(value = 0x7adc669d, name = "GetContactIDs")
	public int[] getContactIDs(ContactsApi.GetContactIDs getContactIDs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc4a353ee, name = "GetStatuses")
	public Api.ContactStatus[] getStatuses(ContactsApi.GetStatuses getStatuses) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x5dd69e12, name = "GetContacts")
	public ContactsApi.Contacts getContacts(ContactsApi.GetContacts getContacts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x2c800be5, name = "ImportContacts")
	public ContactsApi.ImportedContacts importContacts(ContactsApi.ImportContacts importContacts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x96a0e00, name = "DeleteContacts")
	public Api.Updates deleteContacts(ContactsApi.DeleteContacts deleteContacts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1013fd9e, name = "DeleteByPhones")
	public Boolean deleteByPhones(ContactsApi.DeleteByPhones deleteByPhones) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x68cc1411, name = "Block")
	public Boolean block(ContactsApi.Block block) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xbea65d50, name = "Unblock")
	public Boolean unblock(ContactsApi.Unblock unblock) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf57c350f, name = "GetBlocked")
	public ContactsApi.Blocked getBlocked(ContactsApi.GetBlocked getBlocked) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x11f812d8, name = "Search")
	public ContactsApi.Found search(ContactsApi.Search search) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf93ccba3, name = "ResolveUsername")
	public ContactsApi.ResolvedPeer resolveUsername(ContactsApi.ResolveUsername resolveUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x973478b6, name = "GetTopPeers")
	public ContactsApi.TopPeers getTopPeers(ContactsApi.GetTopPeers getTopPeers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1ae373ac, name = "ResetTopPeerRating")
	public Boolean resetTopPeerRating(ContactsApi.ResetTopPeerRating resetTopPeerRating) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x879537f1, name = "ResetSaved")
	public Boolean resetSaved(ContactsApi.ResetSaved resetSaved) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x82f1e39f, name = "GetSaved")
	public Api.TypeSavedContact[] getSaved(ContactsApi.GetSaved getSaved) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8514bdda, name = "ToggleTopPeers")
	public Boolean toggleTopPeers(ContactsApi.ToggleTopPeers toggleTopPeers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe8f463d0, name = "AddContact")
	public Api.Updates addContact(ContactsApi.AddContact addContact) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf831a20f, name = "AcceptContact")
	public Api.Updates acceptContact(ContactsApi.AcceptContact acceptContact) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd348bc44, name = "GetLocated")
	public Api.Updates getLocated(ContactsApi.GetLocated getLocated) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x29a8962c, name = "BlockFromReplies")
	public Api.Updates blockFromReplies(ContactsApi.BlockFromReplies blockFromReplies) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8af94344, name = "ResolvePhone")
	public ContactsApi.ResolvedPeer resolvePhone(ContactsApi.ResolvePhone resolvePhone) {
		return null;
	}
}
