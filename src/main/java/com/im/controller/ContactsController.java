package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ContactsController {

	@WebsocketHandlerMapping(value = 2061264541L, name = "GetContactIDs")
	public int[] getContactIDs(ContactsApi.GetContactIDs getContactIDs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3299038190L, name = "GetStatuses")
	public Api.ContactStatus[] getStatuses(ContactsApi.GetStatuses getStatuses) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1574346258L, name = "GetContacts")
	public ContactsApi.Contacts getContacts(ContactsApi.GetContacts getContacts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 746589157L, name = "ImportContacts")
	public ContactsApi.ImportedContacts importContacts(ContactsApi.ImportContacts importContacts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 157945344L, name = "DeleteContacts")
	public Api.Updates deleteContacts(ContactsApi.DeleteContacts deleteContacts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 269745566L, name = "DeleteByPhones")
	public Boolean deleteByPhones(ContactsApi.DeleteByPhones deleteByPhones) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1758204945L, name = "Block")
	public Boolean block(ContactsApi.Block block) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3198573904L, name = "Unblock")
	public Boolean unblock(ContactsApi.Unblock unblock) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4118557967L, name = "GetBlocked")
	public ContactsApi.Blocked getBlocked(ContactsApi.GetBlocked getBlocked) {
		return null;
	}

	@WebsocketHandlerMapping(value = 301470424L, name = "Search")
	public ContactsApi.Found search(ContactsApi.Search search) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4181511075L, name = "ResolveUsername")
	public ContactsApi.ResolvedPeer resolveUsername(ContactsApi.ResolveUsername resolveUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2536798390L, name = "GetTopPeers")
	public ContactsApi.TopPeers getTopPeers(ContactsApi.GetTopPeers getTopPeers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 451113900L, name = "ResetTopPeerRating")
	public Boolean resetTopPeerRating(ContactsApi.ResetTopPeerRating resetTopPeerRating) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2274703345L, name = "ResetSaved")
	public Boolean resetSaved(ContactsApi.ResetSaved resetSaved) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2196890527L, name = "GetSaved")
	public Api.TypeSavedContact[] getSaved(ContactsApi.GetSaved getSaved) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2232729050L, name = "ToggleTopPeers")
	public Boolean toggleTopPeers(ContactsApi.ToggleTopPeers toggleTopPeers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3908330448L, name = "AddContact")
	public Api.Updates addContact(ContactsApi.AddContact addContact) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4164002319L, name = "AcceptContact")
	public Api.Updates acceptContact(ContactsApi.AcceptContact acceptContact) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3544759364L, name = "GetLocated")
	public Api.Updates getLocated(ContactsApi.GetLocated getLocated) {
		return null;
	}

	@WebsocketHandlerMapping(value = 698914348L, name = "BlockFromReplies")
	public Api.Updates blockFromReplies(ContactsApi.BlockFromReplies blockFromReplies) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2331591492L, name = "ResolvePhone")
	public ContactsApi.ResolvedPeer resolvePhone(ContactsApi.ResolvePhone resolvePhone) {
		return null;
	}
}