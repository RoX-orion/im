package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class ContactsController {

	@WebsocketHandlerMapping(value = 2061264541, name = "GetContactIDs")
	public int[] getContactIDs(ContactsApi.GetContactIDs getContactIDs) {
		return null;
	}

	@WebsocketHandlerMapping(value = -995929106, name = "GetStatuses")
	public Api.ContactStatus[] getStatuses(ContactsApi.GetStatuses getStatuses) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1574346258, name = "GetContacts")
	public ContactsApi.Contacts getContacts(ContactsApi.GetContacts getContacts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 746589157, name = "ImportContacts")
	public ContactsApi.ImportedContacts importContacts(ContactsApi.ImportContacts importContacts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 157945344, name = "DeleteContacts")
	public Api.Updates deleteContacts(ContactsApi.DeleteContacts deleteContacts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 269745566, name = "DeleteByPhones")
	public Boolean deleteByPhones(ContactsApi.DeleteByPhones deleteByPhones) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1758204945, name = "Block")
	public Boolean block(ContactsApi.Block block) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1096393392, name = "Unblock")
	public Boolean unblock(ContactsApi.Unblock unblock) {
		return null;
	}

	@WebsocketHandlerMapping(value = -176409329, name = "GetBlocked")
	public ContactsApi.Blocked getBlocked(ContactsApi.GetBlocked getBlocked) {
		return null;
	}

	@WebsocketHandlerMapping(value = 301470424, name = "Search")
	public ContactsApi.Found search(ContactsApi.Search search) {
		return null;
	}

	@WebsocketHandlerMapping(value = -113456221, name = "ResolveUsername")
	public ContactsApi.ResolvedPeer resolveUsername(ContactsApi.ResolveUsername resolveUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1758168906, name = "GetTopPeers")
	public ContactsApi.TopPeers getTopPeers(ContactsApi.GetTopPeers getTopPeers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 451113900, name = "ResetTopPeerRating")
	public Boolean resetTopPeerRating(ContactsApi.ResetTopPeerRating resetTopPeerRating) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2020263951, name = "ResetSaved")
	public Boolean resetSaved(ContactsApi.ResetSaved resetSaved) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2098076769, name = "GetSaved")
	public Api.TypeSavedContact[] getSaved(ContactsApi.GetSaved getSaved) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2062238246, name = "ToggleTopPeers")
	public Boolean toggleTopPeers(ContactsApi.ToggleTopPeers toggleTopPeers) {
		return null;
	}

	@WebsocketHandlerMapping(value = -386636848, name = "AddContact")
	public Api.Updates addContact(ContactsApi.AddContact addContact) {
		return null;
	}

	@WebsocketHandlerMapping(value = -130964977, name = "AcceptContact")
	public Api.Updates acceptContact(ContactsApi.AcceptContact acceptContact) {
		return null;
	}

	@WebsocketHandlerMapping(value = -750207932, name = "GetLocated")
	public Api.Updates getLocated(ContactsApi.GetLocated getLocated) {
		return null;
	}

	@WebsocketHandlerMapping(value = 698914348, name = "BlockFromReplies")
	public Api.Updates blockFromReplies(ContactsApi.BlockFromReplies blockFromReplies) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1963375804, name = "ResolvePhone")
	public ContactsApi.ResolvedPeer resolvePhone(ContactsApi.ResolvePhone resolvePhone) {
		return null;
	}
}