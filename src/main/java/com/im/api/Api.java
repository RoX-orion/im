package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;
import java.util.HashMap;

public class Api {
    @Data
    public static class X {
        private HashMap<String, Object> data;
    }

    public static class TypeResPQ {
    }

    public static class TypeP_Q_inner_data {
    }

    public static class TypeServer_DH_Params {
    }

    public static class TypeServer_DH_inner_data {
    }

    public static class TypeClient_DH_Inner_Data {
    }

    public static class TypeSet_client_DH_params_answer {
    }

    public static class TypeDestroyAuthKeyRes {
    }

    public static class TypeMsgsAck {
    }

    public static class TypeBadMsgNotification {
    }

    public static class TypeMsgsStateReq {
    }

    public static class TypeMsgsStateInfo {
    }

    public static class TypeMsgsAllInfo {
    }

    public static class TypeMsgDetailedInfo {
    }

    public static class TypeMsgResendReq {
    }

    public static class TypeRpcError {
    }

    public static class TypeRpcDropAnswer {
    }

    public static class TypeFutureSalt {
    }

    public static class TypeFutureSalts {
    }

    public static class TypePong {
    }

    public static class TypeDestroySessionRes {
    }

    public static class TypeNewSession {
    }

    public static class TypeHttpWait {
    }

    public static class TypeIpPort {
    }

    public static class TypeAccessPointRule {
    }

    public static class TypeTlsClientHello {
    }

    public static class TypeTlsBlock {
    }

    public static class TypeInputPeer {
    }

    public static class TypeInputUser {
    }

    public static class TypeInputContact {
    }

    public static class TypeInputFile {
    }

    public static class TypeInputMedia {
    }

    public static class TypeInputChatPhoto {
    }

    public static class TypeInputGeoPoint {
    }

    public static class TypeInputPhoto {
    }

    public static class TypeInputFileLocation {
    }

    public static class TypePeer {
    }

    public static class TypeUser {
    }

    public static class TypeUserProfilePhoto {
    }

    public static class TypeUserStatus {
    }

    public static class TypeChat {
    }

    public static class TypeChatFull {
    }

    public static class TypeChatParticipant {
    }

    public static class TypeChatParticipants {
    }

    public static class TypeChatPhoto {
    }

    public static class TypeMessage {
    }

    public static class TypeMessageMedia {
    }

    public static class TypeMessageAction {
    }

    public static class TypeDialog {
    }

    public static class TypePhoto {
    }

    public static class TypePhotoSize {
    }

    public static class TypeGeoPoint {
    }

    public static class TypeInputNotifyPeer {
    }

    public static class TypeInputPeerNotifySettings {
    }

    public static class TypePeerNotifySettings {
    }

    public static class TypePeerSettings {
    }

    public static class TypeWallPaper {
    }

    public static class TypeReportReason {
    }

    public static class TypeUserFull {
    }

    public static class TypeContact {
    }

    public static class TypeImportedContact {
    }

    public static class TypeContactStatus {
    }

    public static class TypeMessagesFilter {
    }

    public static class TypeUpdate {
    }

    public static class TypeUpdates {
    }

    public static class TypeDcOption {
    }

    public static class TypeConfig {
    }

    public static class TypeNearestDc {
    }

    public static class TypeEncryptedChat {
    }

    public static class TypeInputEncryptedChat {
    }

    public static class TypeEncryptedFile {
    }

    public static class TypeInputEncryptedFile {
    }

    public static class TypeEncryptedMessage {
    }

    public static class TypeInputDocument {
    }

    public static class TypeDocument {
    }

    public static class TypeNotifyPeer {
    }

    public static class TypeSendMessageAction {
    }

    public static class TypeInputPrivacyKey {
    }

    public static class TypePrivacyKey {
    }

    public static class TypeInputPrivacyRule {
    }

    public static class TypePrivacyRule {
    }

    public static class TypeAccountDaysTTL {
    }

    public static class TypeDocumentAttribute {
    }

    public static class TypeStickerPack {
    }

    public static class TypeWebPage {
    }

    public static class TypeAuthorization {
    }

    public static class TypeReceivedNotifyMessage {
    }

    public static class TypeExportedChatInvite {
    }

    public static class TypeChatInvite {
    }

    public static class TypeInputStickerSet {
    }

    public static class TypeStickerSet {
    }

    public static class TypeBotCommand {
    }

    public static class TypeBotInfo {
    }

    public static class TypeKeyboardButton {
    }

    public static class TypeKeyboardButtonRow {
    }

    public static class TypeReplyMarkup {
    }

    public static class TypeMessageEntity {
    }

    public static class TypeInputChannel {
    }

    public static class TypeMessageRange {
    }

    public static class TypeChannelMessagesFilter {
    }

    public static class TypeChannelParticipant {
    }

    public static class TypeChannelParticipantsFilter {
    }

    public static class TypeInputBotInlineMessage {
    }

    public static class TypeInputBotInlineResult {
    }

    public static class TypeBotInlineMessage {
    }

    public static class TypeBotInlineResult {
    }

    public static class TypeExportedMessageLink {
    }

    public static class TypeMessageFwdHeader {
    }

    public static class TypeInputBotInlineMessageID {
    }

    public static class TypeInlineBotSwitchPM {
    }

    public static class TypeTopPeer {
    }

    public static class TypeTopPeerCategory {
    }

    public static class TypeTopPeerCategoryPeers {
    }

    public static class TypeDraftMessage {
    }

    public static class TypeStickerSetCovered {
    }

    public static class TypeMaskCoords {
    }

    public static class TypeInputStickeredMedia {
    }

    public static class TypeGame {
    }

    public static class TypeInputGame {
    }

    public static class TypeHighScore {
    }

    public static class TypeRichText {
    }

    public static class TypePageBlock {
    }

    public static class TypePhoneCallDiscardReason {
    }

    public static class TypeDataJSON {
    }

    public static class TypeLabeledPrice {
    }

    public static class TypeInvoice {
    }

    public static class TypePaymentCharge {
    }

    public static class TypePostAddress {
    }

    public static class TypePaymentRequestedInfo {
    }

    public static class TypePaymentSavedCredentials {
    }

    public static class TypeWebDocument {
    }

    public static class TypeInputWebDocument {
    }

    public static class TypeInputWebFileLocation {
    }

    public static class TypeInputPaymentCredentials {
    }

    public static class TypeShippingOption {
    }

    public static class TypeInputStickerSetItem {
    }

    public static class TypeInputPhoneCall {
    }

    public static class TypePhoneCall {
    }

    public static class TypePhoneConnection {
    }

    public static class TypePhoneCallProtocol {
    }

    public static class TypeCdnPublicKey {
    }

    public static class TypeCdnConfig {
    }

    public static class TypeLangPackString {
    }

    public static class TypeLangPackDifference {
    }

    public static class TypeLangPackLanguage {
    }

    public static class TypeChannelAdminLogEventAction {
    }

    public static class TypeChannelAdminLogEvent {
    }

    public static class TypeChannelAdminLogEventsFilter {
    }

    public static class TypePopularContact {
    }

    public static class TypeRecentMeUrl {
    }

    public static class TypeInputSingleMedia {
    }

    public static class TypeWebAuthorization {
    }

    public static class TypeInputMessage {
    }

    public static class TypeInputDialogPeer {
    }

    public static class TypeDialogPeer {
    }

    public static class TypeFileHash {
    }

    public static class TypeInputClientProxy {
    }

    public static class TypeInputSecureFile {
    }

    public static class TypeSecureFile {
    }

    public static class TypeSecureData {
    }

    public static class TypeSecurePlainData {
    }

    public static class TypeSecureValueType {
    }

    public static class TypeSecureValue {
    }

    public static class TypeInputSecureValue {
    }

    public static class TypeSecureValueHash {
    }

    public static class TypeSecureValueError {
    }

    public static class TypeSecureCredentialsEncrypted {
    }

    public static class TypeSavedContact {
    }

    public static class TypePasswordKdfAlgo {
    }

    public static class TypeSecurePasswordKdfAlgo {
    }

    public static class TypeSecureSecretSettings {
    }

    public static class TypeInputCheckPasswordSRP {
    }

    public static class TypeSecureRequiredType {
    }

    public static class TypeInputAppEvent {
    }

    public static class TypeJSONObjectValue {
    }

    public static class TypeJSONValue {
    }

    public static class TypePageTableCell {
    }

    public static class TypePageTableRow {
    }

    public static class TypePageCaption {
    }

    public static class TypePageListItem {
    }

    public static class TypePageListOrderedItem {
    }

    public static class TypePageRelatedArticle {
    }

    public static class TypePage {
    }

    public static class TypePollAnswer {
    }

    public static class TypePoll {
    }

    public static class TypePollAnswerVoters {
    }

    public static class TypePollResults {
    }

    public static class TypeChatOnlines {
    }

    public static class TypeStatsURL {
    }

    public static class TypeChatAdminRights {
    }

    public static class TypeChatBannedRights {
    }

    public static class TypeInputWallPaper {
    }

    public static class TypeCodeSettings {
    }

    public static class TypeWallPaperSettings {
    }

    public static class TypeAutoDownloadSettings {
    }

    public static class TypeEmojiKeyword {
    }

    public static class TypeEmojiKeywordsDifference {
    }

    public static class TypeEmojiURL {
    }

    public static class TypeEmojiLanguage {
    }

    public static class TypeFolder {
    }

    public static class TypeInputFolderPeer {
    }

    public static class TypeFolderPeer {
    }

    public static class TypeUrlAuthResult {
    }

    public static class TypeChannelLocation {
    }

    public static class TypePeerLocated {
    }

    public static class TypeRestrictionReason {
    }

    public static class TypeInputTheme {
    }

    public static class TypeTheme {
    }

    public static class TypeBaseTheme {
    }

    public static class TypeInputThemeSettings {
    }

    public static class TypeThemeSettings {
    }

    public static class TypeWebPageAttribute {
    }

    public static class TypeMessageUserVote {
    }

    public static class TypeBankCardOpenUrl {
    }

    public static class TypeDialogFilter {
    }

    public static class TypeDialogFilterSuggested {
    }

    public static class TypeStatsDateRangeDays {
    }

    public static class TypeStatsAbsValueAndPrev {
    }

    public static class TypeStatsPercentValue {
    }

    public static class TypeStatsGraph {
    }

    public static class TypeMessageInteractionCounters {
    }

    public static class TypeVideoSize {
    }

    public static class TypeStatsGroupTopPoster {
    }

    public static class TypeStatsGroupTopAdmin {
    }

    public static class TypeStatsGroupTopInviter {
    }

    public static class TypeGlobalPrivacySettings {
    }

    public static class TypeMessageViews {
    }

    public static class TypeMessageReplyHeader {
    }

    public static class TypeMessageReplies {
    }

    public static class TypePeerBlocked {
    }

    public static class TypeGroupCall {
    }

    public static class TypeInputGroupCall {
    }

    public static class TypeGroupCallParticipant {
    }

    public static class TypeInlineQueryPeerType {
    }

    public static class TypeChatInviteImporter {
    }

    public static class TypeChatAdminWithInvites {
    }

    public static class TypeGroupCallParticipantVideoSourceGroup {
    }

    public static class TypeGroupCallParticipantVideo {
    }

    public static class TypeBotCommandScope {
    }

    public static class TypeSponsoredMessage {
    }

    public static class TypeSearchResultsCalendarPeriod {
    }

    public static class TypeSearchResultsPosition {
    }

    public static class TypeReactionCount {
    }

    public static class TypeMessageReactions {
    }

    public static class TypeAvailableReaction {
    }

    public static class TypeMessagePeerReaction {
    }

    public static class TypeGroupCallStreamChannel {
    }

    public static class TypeAttachMenuBotIconColor {
    }

    public static class TypeAttachMenuBotIcon {
    }

    public static class TypeAttachMenuBot {
    }

    public static class TypeAttachMenuBots {
    }

    public static class TypeAttachMenuBotsBot {
    }

    public static class TypeWebViewResult {
    }

    public static class TypeSimpleWebViewResult {
    }

    public static class TypeWebViewMessageSent {
    }

    public static class TypeBotMenuButton {
    }

    public static class TypeNotificationSound {
    }

    public static class TypeAttachMenuPeerType {
    }

    public static class TypeInputInvoice {
    }


    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ResPQ extends Api.TypeResPQ {
        private final Long constructorId = 85337187L;
        private final long subclassOfId = 2020181688L;
        private final Boolean isFunction = false;

        private byte pq;
        private BigInteger[] serverPublicKeyFingerprints;
        private BigInteger serverNonce;
        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PQInnerData extends Api.TypeP_Q_inner_data {
        private final Long constructorId = 2211011308L;
        private final long subclassOfId = 1097864055L;
        private final Boolean isFunction = false;

        private byte p;
        private byte pq;
        private byte q;
        private BigInteger newNonce;
        private BigInteger serverNonce;
        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PQInnerDataDc extends Api.TypeP_Q_inner_data {
        private final Long constructorId = 2851430293L;
        private final long subclassOfId = 1097864055L;
        private final Boolean isFunction = false;

        private byte p;
        private byte pq;
        private byte q;
        private BigInteger newNonce;
        private BigInteger serverNonce;
        private BigInteger nonce;
        private int dc;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PQInnerDataTemp extends Api.TypeP_Q_inner_data {
        private final Long constructorId = 1013613780L;
        private final long subclassOfId = 1097864055L;
        private final Boolean isFunction = false;

        private byte p;
        private int expiresIn;
        private byte pq;
        private byte q;
        private BigInteger newNonce;
        private BigInteger serverNonce;
        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PQInnerDataTempDc extends Api.TypeP_Q_inner_data {
        private final Long constructorId = 1459478408L;
        private final long subclassOfId = 1097864055L;
        private final Boolean isFunction = false;

        private byte p;
        private int expiresIn;
        private byte pq;
        private byte q;
        private BigInteger newNonce;
        private BigInteger serverNonce;
        private BigInteger nonce;
        private int dc;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ServerDHParamsFail extends Api.TypeServer_DH_Params {
        private final Long constructorId = 2043348061L;
        private final long subclassOfId = 2786626974L;
        private final Boolean isFunction = false;

        private BigInteger newNonceHash;
        private BigInteger serverNonce;
        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ServerDHParamsOk extends Api.TypeServer_DH_Params {
        private final Long constructorId = 3504867164L;
        private final long subclassOfId = 2786626974L;
        private final Boolean isFunction = false;

        private byte encryptedAnswer;
        private BigInteger serverNonce;
        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ServerDHInnerData extends Api.TypeServer_DH_inner_data {
        private final Long constructorId = 3045658042L;
        private final long subclassOfId = 3332007868L;
        private final Boolean isFunction = false;

        private int g;
        private byte dhPrime;
        private byte gA;
        private int serverTime;
        private BigInteger serverNonce;
        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ClientDHInnerData extends Api.TypeClient_DH_Inner_Data {
        private final Long constructorId = 1715713620L;
        private final long subclassOfId = 4176408426L;
        private final Boolean isFunction = false;

        private BigInteger serverNonce;
        private BigInteger retryId;
        private byte gB;
        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DhGenOk extends Api.TypeSet_client_DH_params_answer {
        private final Long constructorId = 1003222836L;
        private final long subclassOfId = 1440574683L;
        private final Boolean isFunction = false;

        private BigInteger newNonceHash1;
        private BigInteger serverNonce;
        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DhGenRetry extends Api.TypeSet_client_DH_params_answer {
        private final Long constructorId = 1188831161L;
        private final long subclassOfId = 1440574683L;
        private final Boolean isFunction = false;

        private BigInteger newNonceHash2;
        private BigInteger serverNonce;
        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DhGenFail extends Api.TypeSet_client_DH_params_answer {
        private final Long constructorId = 2795351554L;
        private final long subclassOfId = 1440574683L;
        private final Boolean isFunction = false;

        private BigInteger newNonceHash3;
        private BigInteger serverNonce;
        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DestroyAuthKeyOk extends Api.TypeDestroyAuthKeyRes {
        private final Long constructorId = 4133544404L;
        private final long subclassOfId = 2190599822L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DestroyAuthKeyNone extends Api.TypeDestroyAuthKeyRes {
        private final Long constructorId = 178201177L;
        private final long subclassOfId = 2190599822L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DestroyAuthKeyFail extends Api.TypeDestroyAuthKeyRes {
        private final Long constructorId = 3926956819L;
        private final long subclassOfId = 2190599822L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MsgsAck extends Api.TypeMsgsAck {
        private final Long constructorId = 1658238041L;
        private final long subclassOfId = 2188801988L;
        private final Boolean isFunction = false;

        private BigInteger[] msgIds;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BadMsgNotification extends Api.TypeBadMsgNotification {
        private final Long constructorId = 2817521681L;
        private final long subclassOfId = 3468337495L;
        private final Boolean isFunction = false;

        private BigInteger badMsgId;
        private int badMsgSeqno;
        private int errorCode;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BadServerSalt extends Api.TypeBadMsgNotification {
        private final Long constructorId = 3987424379L;
        private final long subclassOfId = 3468337495L;
        private final Boolean isFunction = false;

        private BigInteger badMsgId;
        private int badMsgSeqno;
        private BigInteger newServerSalt;
        private int errorCode;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MsgsStateReq extends Api.TypeMsgsStateReq {
        private final Long constructorId = 3664378706L;
        private final long subclassOfId = 418389456L;
        private final Boolean isFunction = false;

        private BigInteger[] msgIds;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MsgsStateInfo extends Api.TypeMsgsStateInfo {
        private final Long constructorId = 81704317L;
        private final long subclassOfId = 118098532L;
        private final Boolean isFunction = false;

        private BigInteger reqMsgId;
        private String info;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MsgsAllInfo extends Api.TypeMsgsAllInfo {
        private final Long constructorId = 2361446705L;
        private final long subclassOfId = 4203727700L;
        private final Boolean isFunction = false;

        private BigInteger[] msgIds;
        private String info;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MsgDetailedInfo extends Api.TypeMsgDetailedInfo {
        private final Long constructorId = 661470918L;
        private final long subclassOfId = 1597167086L;
        private final Boolean isFunction = false;

        private int bytes;
        private BigInteger msgId;
        private BigInteger answerMsgId;
        private int status;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MsgNewDetailedInfo extends Api.TypeMsgDetailedInfo {
        private final Long constructorId = 2157819615L;
        private final long subclassOfId = 1597167086L;
        private final Boolean isFunction = false;

        private int bytes;
        private BigInteger answerMsgId;
        private int status;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MsgResendReq extends Api.TypeMsgResendReq {
        private final Long constructorId = 2105940488L;
        private final long subclassOfId = 33703188L;
        private final Boolean isFunction = false;

        private BigInteger[] msgIds;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class RpcError extends Api.TypeRpcError {
        private final Long constructorId = 558156313L;
        private final long subclassOfId = 1243079269L;
        private final Boolean isFunction = false;

        private String errorMessage;
        private int errorCode;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class RpcAnswerUnknown extends Api.TypeRpcDropAnswer {
        private final Long constructorId = 1579864942L;
        private final long subclassOfId = 1271559536L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class RpcAnswerDroppedRunning extends Api.TypeRpcDropAnswer {
        private final Long constructorId = 3447252358L;
        private final long subclassOfId = 1271559536L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class RpcAnswerDropped extends Api.TypeRpcDropAnswer {
        private final Long constructorId = 2755319991L;
        private final long subclassOfId = 1271559536L;
        private final Boolean isFunction = false;

        private int seqNo;
        private int bytes;
        private BigInteger msgId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class FutureSalt extends Api.TypeFutureSalt {
        private final Long constructorId = 155834844L;
        private final long subclassOfId = 1172651471L;
        private final Boolean isFunction = false;

        private int validSince;
        private BigInteger salt;
        private int validUntil;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class FutureSalts extends Api.TypeFutureSalts {
        private final Long constructorId = 2924480661L;
        private final long subclassOfId = 277935383L;
        private final Boolean isFunction = false;

        private int now;
        private BigInteger reqMsgId;
        private Object[] salts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Pong extends Api.TypePong {
        private final Long constructorId = 880243653L;
        private final long subclassOfId = 2171268721L;
        private final Boolean isFunction = false;

        private BigInteger pingId;
        private BigInteger msgId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DestroySessionOk extends Api.TypeDestroySessionRes {
        private final Long constructorId = 3793765884L;
        private final long subclassOfId = 2936858557L;
        private final Boolean isFunction = false;

        private BigInteger sessionId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DestroySessionNone extends Api.TypeDestroySessionRes {
        private final Long constructorId = 1658015945L;
        private final long subclassOfId = 2936858557L;
        private final Boolean isFunction = false;

        private BigInteger sessionId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class NewSessionCreated extends Api.TypeNewSession {
        private final Long constructorId = 2663516424L;
        private final long subclassOfId = 1359818801L;
        private final Boolean isFunction = false;

        private BigInteger firstMsgId;
        private BigInteger serverSalt;
        private BigInteger uniqueId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class HttpWait extends Api.TypeHttpWait {
        private final Long constructorId = 2459514271L;
        private final long subclassOfId = 310685398L;
        private final Boolean isFunction = false;

        private int maxDelay;
        private int waitAfter;
        private int maxWait;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class IpPort extends Api.TypeIpPort {
        private final Long constructorId = 3560156531L;
        private final long subclassOfId = 2728408870L;
        private final Boolean isFunction = false;

        private int ipv4;
        private int port;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class IpPortSecret extends Api.TypeIpPort {
        private final Long constructorId = 932718150L;
        private final long subclassOfId = 2728408870L;
        private final Boolean isFunction = false;

        private int ipv4;
        private int port;
        private byte secret;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AccessPointRule extends Api.TypeAccessPointRule {
        private final Long constructorId = 1182381663L;
        private final long subclassOfId = 2980880637L;
        private final Boolean isFunction = false;

        private String phonePrefixRules;
        private int dcId;
        private Api.TypeIpPort[] ips;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TlsClientHello extends Api.TypeTlsClientHello {
        private final Long constructorId = 262524817L;
        private final long subclassOfId = 3203533088L;
        private final Boolean isFunction = false;

        private Api.TypeTlsBlock[] blocks;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TlsBlockString extends Api.TypeTlsBlock {
        private final Long constructorId = 1488907607L;
        private final long subclassOfId = 4044764304L;
        private final Boolean isFunction = false;

        private String data;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TlsBlockRandom extends Api.TypeTlsBlock {
        private final Long constructorId = 3265966728L;
        private final long subclassOfId = 4044764304L;
        private final Boolean isFunction = false;

        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TlsBlockZero extends Api.TypeTlsBlock {
        private final Long constructorId = 3400654219L;
        private final long subclassOfId = 4044764304L;
        private final Boolean isFunction = false;

        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TlsBlockDomain extends Api.TypeTlsBlock {
        private final Long constructorId = 283665263L;
        private final long subclassOfId = 4044764304L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TlsBlockGrease extends Api.TypeTlsBlock {
        private final Long constructorId = 2623335513L;
        private final long subclassOfId = 4044764304L;
        private final Boolean isFunction = false;

        private int seed;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TlsBlockScope extends Api.TypeTlsBlock {
        private final Long constructorId = 3638474097L;
        private final long subclassOfId = 4044764304L;
        private final Boolean isFunction = false;

        private Api.TypeTlsBlock[] entries;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPeerEmpty extends Api.TypeInputPeer {
        private final Long constructorId = 2134579434L;
        private final long subclassOfId = 3374092470L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPeerSelf extends Api.TypeInputPeer {
        private final Long constructorId = 2107670217L;
        private final long subclassOfId = 3374092470L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPeerChat extends Api.TypeInputPeer {
        private final Long constructorId = 900291769L;
        private final long subclassOfId = 3374092470L;
        private final Boolean isFunction = false;

        private BigInteger chatId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPeerUser extends Api.TypeInputPeer {
        private final Long constructorId = 3723011404L;
        private final long subclassOfId = 3374092470L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPeerChannel extends Api.TypeInputPeer {
        private final Long constructorId = 666680316L;
        private final long subclassOfId = 3374092470L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPeerUserFromMessage extends Api.TypeInputPeer {
        private final Long constructorId = 2826635804L;
        private final long subclassOfId = 3374092470L;
        private final Boolean isFunction = false;

        private Api.TypeInputPeer peer;
        private int msgId;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPeerChannelFromMessage extends Api.TypeInputPeer {
        private final Long constructorId = 3173648448L;
        private final long subclassOfId = 3374092470L;
        private final Boolean isFunction = false;

        private Api.TypeInputPeer peer;
        private int msgId;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputUserEmpty extends Api.TypeInputUser {
        private final Long constructorId = 3112732367L;
        private final long subclassOfId = 3865689926L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputUserSelf extends Api.TypeInputUser {
        private final Long constructorId = 4156666175L;
        private final long subclassOfId = 3865689926L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputUser extends Api.TypeInputUser {
        private final Long constructorId = 4061223110L;
        private final long subclassOfId = 3865689926L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputUserFromMessage extends Api.TypeInputUser {
        private final Long constructorId = 497305826L;
        private final long subclassOfId = 3865689926L;
        private final Boolean isFunction = false;

        private Api.TypeInputPeer peer;
        private int msgId;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPhoneContact extends Api.TypeInputContact {
        private final Long constructorId = 4086478836L;
        private final long subclassOfId = 2926144130L;
        private final Boolean isFunction = false;

        private String firstName;
        private String lastName;
        private BigInteger clientId;
        private String phone;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputFile extends Api.TypeInputFile {
        private final Long constructorId = 4113560191L;
        private final long subclassOfId = 3882180383L;
        private final Boolean isFunction = false;

        private String md5Checksum;
        private int parts;
        private String name;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputFileBig extends Api.TypeInputFile {
        private final Long constructorId = 4199484341L;
        private final long subclassOfId = 3882180383L;
        private final Boolean isFunction = false;

        private int parts;
        private String name;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaEmpty extends Api.TypeInputMedia {
        private final Long constructorId = 2523198847L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaUploadedPhoto extends Api.TypeInputMedia {
        private final Long constructorId = 505969924L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private Api.TypeInputFile file;
        private Api.TypeInputDocument[] stickers;
        private int ttlSeconds;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaPhoto extends Api.TypeInputMedia {
        private final Long constructorId = 3015312949L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private Api.TypeInputPhoto id;
        private int ttlSeconds;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaGeoPoint extends Api.TypeInputMedia {
        private final Long constructorId = 4190388548L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private Api.TypeInputGeoPoint geoPoint;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaContact extends Api.TypeInputMedia {
        private final Long constructorId = 4171988475L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String vcard;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaUploadedDocument extends Api.TypeInputMedia {
        private final Long constructorId = 1530447553L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private Api.TypeInputFile file;
        private Api.TypeInputFile thumb;
        private Boolean forceFile;
        private Api.TypeDocumentAttribute[] attributes;
        private Api.TypeInputDocument[] stickers;
        private String mimeType;
        private Boolean nosoundVideo;
        private int ttlSeconds;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaDocument extends Api.TypeInputMedia {
        private final Long constructorId = 860303448L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private String query;
        private Api.TypeInputDocument id;
        private int ttlSeconds;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaVenue extends Api.TypeInputMedia {
        private final Long constructorId = 3242007569L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private String address;
        private String venueType;
        private String provider;
        private String venueId;
        private Api.TypeInputGeoPoint geoPoint;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaPhotoExternal extends Api.TypeInputMedia {
        private final Long constructorId = 3854302746L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private int ttlSeconds;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaDocumentExternal extends Api.TypeInputMedia {
        private final Long constructorId = 4216511641L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private int ttlSeconds;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaGame extends Api.TypeInputMedia {
        private final Long constructorId = 3544138739L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private Api.TypeInputGame id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaInvoice extends Api.TypeInputMedia {
        private final Long constructorId = 3648624756L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private String startParam;
        private byte payload;
        private String provider;
        private Api.TypeDataJSON providerData;
        private String description;
        private Api.TypeInputWebDocument photo;
        private Api.TypeInvoice invoice;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaGeoLive extends Api.TypeInputMedia {
        private final Long constructorId = 2535434307L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private Boolean stopped;
        private int period;
        private int heading;
        private Api.TypeInputGeoPoint geoPoint;
        private int proximityNotificationRadius;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaPoll extends Api.TypeInputMedia {
        private final Long constructorId = 261416433L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private String solution;
        private Api.TypePoll poll;
        private byte[] correctAnswers;
        private Api.TypeMessageEntity[] solutionEntities;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMediaDice extends Api.TypeInputMedia {
        private final Long constructorId = 3866083195L;
        private final long subclassOfId = 4210575092L;
        private final Boolean isFunction = false;

        private String emoticon;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputChatPhotoEmpty extends Api.TypeInputChatPhoto {
        private final Long constructorId = 480546647L;
        private final long subclassOfId = 3572182388L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputChatUploadedPhoto extends Api.TypeInputChatPhoto {
        private final Long constructorId = 3326243406L;
        private final long subclassOfId = 3572182388L;
        private final Boolean isFunction = false;

        private Api.TypeInputFile file;
        private double videoStartTs;
        private Api.TypeInputFile video;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputChatPhoto extends Api.TypeInputChatPhoto {
        private final Long constructorId = 2303962423L;
        private final long subclassOfId = 3572182388L;
        private final Boolean isFunction = false;

        private Api.TypeInputPhoto id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputGeoPointEmpty extends Api.TypeInputGeoPoint {
        private final Long constructorId = 3837862870L;
        private final long subclassOfId = 70308389L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputGeoPoint extends Api.TypeInputGeoPoint {
        private final Long constructorId = 1210199983L;
        private final long subclassOfId = 70308389L;
        private final Boolean isFunction = false;

        private int accuracyRadius;
        private double lat;
        private double longSuffix;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPhotoEmpty extends Api.TypeInputPhoto {
        private final Long constructorId = 483901197L;
        private final long subclassOfId = 2221106144L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPhoto extends Api.TypeInputPhoto {
        private final Long constructorId = 1001634122L;
        private final long subclassOfId = 2221106144L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger id;
        private byte fileReference;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputFileLocation extends Api.TypeInputFileLocation {
        private final Long constructorId = 3755650017L;
        private final long subclassOfId = 354669666L;
        private final Boolean isFunction = false;

        private BigInteger volumeId;
        private BigInteger secret;
        private byte fileReference;
        private int localId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputEncryptedFileLocation extends Api.TypeInputFileLocation {
        private final Long constructorId = 4112735573L;
        private final long subclassOfId = 354669666L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputDocumentFileLocation extends Api.TypeInputFileLocation {
        private final Long constructorId = 3134223748L;
        private final long subclassOfId = 354669666L;
        private final Boolean isFunction = false;

        private String thumbSize;
        private BigInteger accessHash;
        private BigInteger id;
        private byte fileReference;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputSecureFileLocation extends Api.TypeInputFileLocation {
        private final Long constructorId = 3418877480L;
        private final long subclassOfId = 354669666L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputTakeoutFileLocation extends Api.TypeInputFileLocation {
        private final Long constructorId = 700340377L;
        private final long subclassOfId = 354669666L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPhotoFileLocation extends Api.TypeInputFileLocation {
        private final Long constructorId = 1075322878L;
        private final long subclassOfId = 354669666L;
        private final Boolean isFunction = false;

        private String thumbSize;
        private BigInteger accessHash;
        private BigInteger id;
        private byte fileReference;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPhotoLegacyFileLocation extends Api.TypeInputFileLocation {
        private final Long constructorId = 3627312883L;
        private final long subclassOfId = 354669666L;
        private final Boolean isFunction = false;

        private BigInteger volumeId;
        private BigInteger accessHash;
        private BigInteger id;
        private BigInteger secret;
        private byte fileReference;
        private int localId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPeerPhotoFileLocation extends Api.TypeInputFileLocation {
        private final Long constructorId = 925204121L;
        private final long subclassOfId = 354669666L;
        private final Boolean isFunction = false;

        private Boolean big;
        private Api.TypeInputPeer peer;
        private BigInteger photoId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputStickerSetThumb extends Api.TypeInputFileLocation {
        private final Long constructorId = 2642736091L;
        private final long subclassOfId = 354669666L;
        private final Boolean isFunction = false;

        private Api.TypeInputStickerSet stickerset;
        private int thumbVersion;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputGroupCallStream extends Api.TypeInputFileLocation {
        private final Long constructorId = 93890858L;
        private final long subclassOfId = 354669666L;
        private final Boolean isFunction = false;

        private Api.TypeInputGroupCall call;
        private int scale;
        private int videoChannel;
        private BigInteger timeMs;
        private int videoQuality;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PeerUser extends Api.TypePeer {
        private final Long constructorId = 1498486562L;
        private final long subclassOfId = 47470215L;
        private final Boolean isFunction = false;

        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PeerChat extends Api.TypePeer {
        private final Long constructorId = 918946202L;
        private final long subclassOfId = 47470215L;
        private final Boolean isFunction = false;

        private BigInteger chatId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PeerChannel extends Api.TypePeer {
        private final Long constructorId = 2728736542L;
        private final long subclassOfId = 47470215L;
        private final Boolean isFunction = false;

        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UserEmpty extends Api.TypeUser {
        private final Long constructorId = 3552332666L;
        private final long subclassOfId = 765557111L;
        private final Boolean isFunction = false;

        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class User extends Api.TypeUser {
        private final Long constructorId = 1073147056L;
        private final long subclassOfId = 765557111L;
        private final Boolean isFunction = false;

        private Boolean botChatHistory;
        private String lastName;
        private Boolean attachMenuEnabled;
        private Boolean bot;
        private String langCode;
        private Boolean scam;
        private Api.TypeRestrictionReason[] restrictionReason;
        private int botInfoVersion;
        private Boolean min;
        private Boolean premium;
        private Boolean contact;
        private String botInlinePlaceholder;
        private BigInteger id;
        private Boolean botAttachMenu;
        private Boolean mutualContact;
        private Boolean verified;
        private Api.TypeUserProfilePhoto photo;
        private Boolean botInlineGeo;
        private String firstName;
        private Boolean deleted;
        private String phone;
        private Boolean botNochats;
        private Boolean restricted;
        private Boolean applyMinPhoto;
        private Boolean self;
        private Boolean fake;
        private BigInteger accessHash;
        private Boolean support;
        private String username;
        private Api.TypeUserStatus status;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UserProfilePhotoEmpty extends Api.TypeUserProfilePhoto {
        private final Long constructorId = 1326562017L;
        private final long subclassOfId = 3325267837L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UserProfilePhoto extends Api.TypeUserProfilePhoto {
        private final Long constructorId = 2194798342L;
        private final long subclassOfId = 3325267837L;
        private final Boolean isFunction = false;

        private Boolean hasVideo;
        private int dcId;
        private BigInteger photoId;
        private byte strippedThumb;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UserStatusEmpty extends Api.TypeUserStatus {
        private final Long constructorId = 164646985L;
        private final long subclassOfId = 1527477310L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UserStatusOnline extends Api.TypeUserStatus {
        private final Long constructorId = 3988339017L;
        private final long subclassOfId = 1527477310L;
        private final Boolean isFunction = false;

        private int expires;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UserStatusOffline extends Api.TypeUserStatus {
        private final Long constructorId = 9203775L;
        private final long subclassOfId = 1527477310L;
        private final Boolean isFunction = false;

        private int wasOnline;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UserStatusRecently extends Api.TypeUserStatus {
        private final Long constructorId = 3798942449L;
        private final long subclassOfId = 1527477310L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UserStatusLastWeek extends Api.TypeUserStatus {
        private final Long constructorId = 129960444L;
        private final long subclassOfId = 1527477310L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UserStatusLastMonth extends Api.TypeUserStatus {
        private final Long constructorId = 2011940674L;
        private final long subclassOfId = 1527477310L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatEmpty extends Api.TypeChat {
        private final Long constructorId = 693512293L;
        private final long subclassOfId = 3316604308L;
        private final Boolean isFunction = false;

        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Chat extends Api.TypeChat {
        private final Long constructorId = 1103884886L;
        private final long subclassOfId = 3316604308L;
        private final Boolean isFunction = false;

        private int date;
        private int participantsCount;
        private Boolean creator;
        private Boolean noforwards;
        private Api.TypeChatPhoto photo;
        private Api.TypeChatBannedRights defaultBannedRights;
        private String title;
        private Boolean callActive;
        private int version;
        private Boolean deactivated;
        private Boolean callNotEmpty;
        private Api.TypeChatAdminRights adminRights;
        private Boolean left;
        private Api.TypeInputChannel migratedTo;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatForbidden extends Api.TypeChat {
        private final Long constructorId = 1704108455L;
        private final long subclassOfId = 3316604308L;
        private final Boolean isFunction = false;

        private BigInteger id;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Channel extends Api.TypeChat {
        private final Long constructorId = 2187439201L;
        private final long subclassOfId = 3316604308L;
        private final Boolean isFunction = false;

        private Boolean broadcast;
        private int date;
        private int participantsCount;
        private Boolean noforwards;
        private Boolean scam;
        private Api.TypeRestrictionReason[] restrictionReason;
        private String title;
        private Boolean callActive;
        private Boolean signatures;
        private Boolean megagroup;
        private Boolean min;
        private Boolean hasGeo;
        private Boolean joinToSend;
        private BigInteger id;
        private Api.TypeChatBannedRights bannedRights;
        private Boolean joinRequest;
        private Boolean creator;
        private Boolean verified;
        private Api.TypeChatPhoto photo;
        private Boolean slowmodeEnabled;
        private Api.TypeChatBannedRights defaultBannedRights;
        private Boolean callNotEmpty;
        private Boolean gigagroup;
        private Api.TypeChatAdminRights adminRights;
        private Boolean hasLink;
        private Boolean left;
        private Boolean restricted;
        private Boolean fake;
        private BigInteger accessHash;
        private String username;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelForbidden extends Api.TypeChat {
        private final Long constructorId = 399807445L;
        private final long subclassOfId = 3316604308L;
        private final Boolean isFunction = false;

        private Boolean broadcast;
        private int untilDate;
        private BigInteger accessHash;
        private BigInteger id;
        private String title;
        private Boolean megagroup;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatFull extends Api.TypeChatFull {
        private final Long constructorId = 3515802150L;
        private final long subclassOfId = 3566872215L;
        private final Boolean isFunction = false;

        private Api.TypePhoto chatPhoto;
        private Api.TypePeer groupcallDefaultJoinAs;
        private Api.TypeBotInfo[] botInfo;
        private int pinnedMsgId;
        private String[] availableReactions;
        private String about;
        private BigInteger[] recentRequesters;
        private Boolean canSetUsername;
        private Api.TypePeerNotifySettings notifySettings;
        private int folderId;
        private Api.TypeInputGroupCall call;
        private String themeEmoticon;
        private int requestsPending;
        private int ttlPeriod;
        private BigInteger id;
        private Boolean hasScheduled;
        private Api.TypeExportedChatInvite exportedInvite;
        private Api.TypeChatParticipants participants;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelFull extends Api.TypeChatFull {
        private final Long constructorId = 3932726809L;
        private final long subclassOfId = 3566872215L;
        private final Boolean isFunction = false;

        private int participantsCount;
        private int migratedFromMaxId;
        private Api.TypePhoto chatPhoto;
        private int kickedCount;
        private int readInboxMaxId;
        private Api.TypeBotInfo[] botInfo;
        private int pinnedMsgId;
        private String about;
        private BigInteger[] recentRequesters;
        private int unreadCount;
        private Boolean canSetLocation;
        private Boolean canSetUsername;
        private int adminsCount;
        private int slowmodeSeconds;
        private Api.TypePeer defaultSendAs;
        private Boolean canViewParticipants;
        private String themeEmoticon;
        private int statsDc;
        private Boolean blocked;
        private int requestsPending;
        private int availableMinId;
        private BigInteger id;
        private Boolean hasScheduled;
        private Api.TypeExportedChatInvite exportedInvite;
        private int onlineCount;
        private BigInteger migratedFromChatId;
        private Api.TypePeer groupcallDefaultJoinAs;
        private Boolean canViewStats;
        private Boolean canDeleteChannel;
        private BigInteger linkedChatId;
        private String[] availableReactions;
        private Boolean hiddenPrehistory;
        private Api.TypePeerNotifySettings notifySettings;
        private int folderId;
        private int pts;
        private Boolean canSetStickers;
        private String[] pendingSuggestions;
        private Api.TypeInputGroupCall call;
        private int readOutboxMaxId;
        private int bannedCount;
        private int ttlPeriod;
        private Api.TypeStickerSet stickerset;
        private Api.TypeChannelLocation location;
        private int slowmodeNextSendDate;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatParticipant extends Api.TypeChatParticipant {
        private final Long constructorId = 3224190983L;
        private final long subclassOfId = 2105307014L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger inviterId;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatParticipantCreator extends Api.TypeChatParticipant {
        private final Long constructorId = 3832270564L;
        private final long subclassOfId = 2105307014L;
        private final Boolean isFunction = false;

        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatParticipantAdmin extends Api.TypeChatParticipant {
        private final Long constructorId = 2694004571L;
        private final long subclassOfId = 2105307014L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger inviterId;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatParticipantsForbidden extends Api.TypeChatParticipants {
        private final Long constructorId = 2271466465L;
        private final long subclassOfId = 531142001L;
        private final Boolean isFunction = false;

        private Api.TypeChatParticipant selfParticipant;
        private BigInteger chatId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatParticipants extends Api.TypeChatParticipants {
        private final Long constructorId = 1018991608L;
        private final long subclassOfId = 531142001L;
        private final Boolean isFunction = false;

        private BigInteger chatId;
        private int version;
        private Api.TypeChatParticipant[] participants;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatPhotoEmpty extends Api.TypeChatPhoto {
        private final Long constructorId = 935395612L;
        private final long subclassOfId = 2889794789L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatPhoto extends Api.TypeChatPhoto {
        private final Long constructorId = 476978193L;
        private final long subclassOfId = 2889794789L;
        private final Boolean isFunction = false;

        private Boolean hasVideo;
        private int dcId;
        private BigInteger photoId;
        private byte strippedThumb;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEmpty extends Api.TypeMessage {
        private final Long constructorId = 2426849924L;
        private final long subclassOfId = 2030045667L;
        private final Boolean isFunction = false;

        private Api.TypePeer peerId;
        private int id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Message extends Api.TypeMessage {
        private final Long constructorId = 940666592L;
        private final long subclassOfId = 2030045667L;
        private final Boolean isFunction = false;

        private Api.TypePeer peerId;
        private int date;
        private int forwards;
        private BigInteger viaBotId;
        private Boolean pinned;
        private Boolean legacy;
        private Boolean noforwards;
        private Api.TypeMessageMedia media;
        private Api.TypeRestrictionReason[] restrictionReason;
        private Boolean out;
        private Boolean mediaUnread;
        private Api.TypeMessageFwdHeader fwdFrom;
        private String postAuthor;
        private Boolean post;
        private Boolean editHide;
        private int id;
        private Boolean mentioned;
        private int views;
        private Boolean silent;
        private String message;
        private Api.TypePeer fromId;
        private int editDate;
        private Api.TypeMessageReplies replies;
        private Api.TypeMessageEntity[] entities;
        private Api.TypeReplyMarkup replyMarkup;
        private Api.TypeMessageReplyHeader replyTo;
        private int ttlPeriod;
        private BigInteger groupedId;
        private Api.TypeMessageReactions reactions;
        private Boolean fromScheduled;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageService extends Api.TypeMessage {
        private final Long constructorId = 721967202L;
        private final long subclassOfId = 2030045667L;
        private final Boolean isFunction = false;

        private Api.TypePeer peerId;
        private int date;
        private Boolean silent;
        private Boolean legacy;
        private Api.TypePeer fromId;
        private Boolean out;
        private Boolean mediaUnread;
        private Boolean post;
        private Api.TypeMessageReplyHeader replyTo;
        private Api.TypeMessageAction action;
        private int ttlPeriod;
        private int id;
        private Boolean mentioned;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaEmpty extends Api.TypeMessageMedia {
        private final Long constructorId = 1038967584L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaPhoto extends Api.TypeMessageMedia {
        private final Long constructorId = 1766936791L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

        private Api.TypePhoto photo;
        private int ttlSeconds;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaGeo extends Api.TypeMessageMedia {
        private final Long constructorId = 1457575028L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

        private Api.TypeGeoPoint geo;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaContact extends Api.TypeMessageMedia {
        private final Long constructorId = 1882335561L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String vcard;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaUnsupported extends Api.TypeMessageMedia {
        private final Long constructorId = 2676290718L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaDocument extends Api.TypeMessageMedia {
        private final Long constructorId = 2628808919L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

        private Api.TypeDocument document;
        private Boolean nopremium;
        private int ttlSeconds;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaWebPage extends Api.TypeMessageMedia {
        private final Long constructorId = 2737690112L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

        private Api.TypeWebPage webpage;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaVenue extends Api.TypeMessageMedia {
        private final Long constructorId = 784356159L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

        private Api.TypeGeoPoint geo;
        private String address;
        private String venueType;
        private String provider;
        private String venueId;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaGame extends Api.TypeMessageMedia {
        private final Long constructorId = 4256272392L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

        private Api.TypeGame game;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaInvoice extends Api.TypeMessageMedia {
        private final Long constructorId = 2220168007L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

        private BigInteger totalAmount;
        private int receiptMsgId;
        private Boolean test;
        private String startParam;
        private Boolean shippingAddressRequested;
        private String description;
        private Api.TypeWebDocument photo;
        private String currency;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaGeoLive extends Api.TypeMessageMedia {
        private final Long constructorId = 3108030054L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

        private Api.TypeGeoPoint geo;
        private int period;
        private int heading;
        private int proximityNotificationRadius;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaPoll extends Api.TypeMessageMedia {
        private final Long constructorId = 1272375192L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

        private Api.TypePoll poll;
        private Api.TypePollResults results;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageMediaDice extends Api.TypeMessageMedia {
        private final Long constructorId = 1065280907L;
        private final long subclassOfId = 1198308914L;
        private final Boolean isFunction = false;

        private int value;
        private String emoticon;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionEmpty extends Api.TypeMessageAction {
        private final Long constructorId = 3064919984L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionChatCreate extends Api.TypeMessageAction {
        private final Long constructorId = 3175599021L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private String title;
        private BigInteger[] users;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionChatEditTitle extends Api.TypeMessageAction {
        private final Long constructorId = 3047280218L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionChatEditPhoto extends Api.TypeMessageAction {
        private final Long constructorId = 2144015272L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private Api.TypePhoto photo;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionChatDeletePhoto extends Api.TypeMessageAction {
        private final Long constructorId = 2514746351L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionChatAddUser extends Api.TypeMessageAction {
        private final Long constructorId = 365886720L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private BigInteger[] users;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionChatDeleteUser extends Api.TypeMessageAction {
        private final Long constructorId = 2755604684L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionChatJoinedByLink extends Api.TypeMessageAction {
        private final Long constructorId = 51520707L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private BigInteger inviterId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionChannelCreate extends Api.TypeMessageAction {
        private final Long constructorId = 2513611922L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionChatMigrateTo extends Api.TypeMessageAction {
        private final Long constructorId = 3775102866L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionChannelMigrateFrom extends Api.TypeMessageAction {
        private final Long constructorId = 3929622761L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private BigInteger chatId;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionPinMessage extends Api.TypeMessageAction {
        private final Long constructorId = 2495428845L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionHistoryClear extends Api.TypeMessageAction {
        private final Long constructorId = 2679813636L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionGameScore extends Api.TypeMessageAction {
        private final Long constructorId = 2460428406L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private BigInteger gameId;
        private int score;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionPaymentSentMe extends Api.TypeMessageAction {
        private final Long constructorId = 2402399015L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private BigInteger totalAmount;
        private Api.TypePaymentCharge charge;
        private byte payload;
        private String currency;
        private String shippingOptionId;
        private Boolean recurringUsed;
        private Boolean recurringInit;
        private Api.TypePaymentRequestedInfo info;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionPaymentSent extends Api.TypeMessageAction {
        private final Long constructorId = 2518040406L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private BigInteger totalAmount;
        private String invoiceSlug;
        private String currency;
        private Boolean recurringUsed;
        private Boolean recurringInit;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionPhoneCall extends Api.TypeMessageAction {
        private final Long constructorId = 2162236031L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private BigInteger callId;
        private int duration;
        private Api.TypePhoneCallDiscardReason reason;
        private Boolean video;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionScreenshotTaken extends Api.TypeMessageAction {
        private final Long constructorId = 1200788123L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionCustomAction extends Api.TypeMessageAction {
        private final Long constructorId = 4209418070L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private String message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionBotAllowed extends Api.TypeMessageAction {
        private final Long constructorId = 2884218878L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private String domain;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionSecureValuesSentMe extends Api.TypeMessageAction {
        private final Long constructorId = 455635795L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private Api.TypeSecureCredentialsEncrypted credentials;
        private Api.TypeSecureValue[] values;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionSecureValuesSent extends Api.TypeMessageAction {
        private final Long constructorId = 3646710100L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private Api.TypeSecureValueType[] types;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionContactSignUp extends Api.TypeMessageAction {
        private final Long constructorId = 4092747638L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionGeoProximityReached extends Api.TypeMessageAction {
        private final Long constructorId = 2564871831L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private Api.TypePeer toId;
        private int distance;
        private Api.TypePeer fromId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionGroupCall extends Api.TypeMessageAction {
        private final Long constructorId = 2047704898L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private Api.TypeInputGroupCall call;
        private int duration;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionInviteToGroupCall extends Api.TypeMessageAction {
        private final Long constructorId = 1345295095L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private Api.TypeInputGroupCall call;
        private BigInteger[] users;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionSetMessagesTTL extends Api.TypeMessageAction {
        private final Long constructorId = 2853895165L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private int period;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionGroupCallScheduled extends Api.TypeMessageAction {
        private final Long constructorId = 3013637729L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private Api.TypeInputGroupCall call;
        private int scheduleDate;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionSetChatTheme extends Api.TypeMessageAction {
        private final Long constructorId = 2860016453L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private String emoticon;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionChatJoinedByRequest extends Api.TypeMessageAction {
        private final Long constructorId = 3955008459L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionWebViewDataSentMe extends Api.TypeMessageAction {
        private final Long constructorId = 1205698681L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private String data;
        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageActionWebViewDataSent extends Api.TypeMessageAction {
        private final Long constructorId = 3032714421L;
        private final long subclassOfId = 2256589094L;
        private final Boolean isFunction = false;

        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Dialog extends Api.TypeDialog {
        private final Long constructorId = 2834157813L;
        private final long subclassOfId = 1120787796L;
        private final Boolean isFunction = false;

        private Boolean pinned;
        private Boolean unreadMark;
        private int readInboxMaxId;
        private int unreadMentionsCount;
        private int topMessage;
        private int unreadCount;
        private Api.TypePeerNotifySettings notifySettings;
        private int pts;
        private int folderId;
        private int readOutboxMaxId;
        private Api.TypePeer peer;
        private Api.TypeDraftMessage draft;
        private int unreadReactionsCount;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DialogFolder extends Api.TypeDialog {
        private final Long constructorId = 1908216652L;
        private final long subclassOfId = 1120787796L;
        private final Boolean isFunction = false;

        private Boolean pinned;
        private Api.TypeFolder folder;
        private int unreadMutedMessagesCount;
        private Api.TypePeer peer;
        private int topMessage;
        private int unreadUnmutedMessagesCount;
        private int unreadMutedPeersCount;
        private int unreadUnmutedPeersCount;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhotoEmpty extends Api.TypePhoto {
        private final Long constructorId = 590459437L;
        private final long subclassOfId = 3581324060L;
        private final Boolean isFunction = false;

        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Photo extends Api.TypePhoto {
        private final Long constructorId = 4212750949L;
        private final long subclassOfId = 3581324060L;
        private final Boolean isFunction = false;

        private Boolean hasStickers;
        private int date;
        private Api.TypePhotoSize[] sizes;
        private Api.TypeVideoSize[] videoSizes;
        private int dcId;
        private BigInteger accessHash;
        private BigInteger id;
        private byte fileReference;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhotoSizeEmpty extends Api.TypePhotoSize {
        private final Long constructorId = 236446268L;
        private final long subclassOfId = 399256025L;
        private final Boolean isFunction = false;

        private String type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhotoSize extends Api.TypePhotoSize {
        private final Long constructorId = 1976012384L;
        private final long subclassOfId = 399256025L;
        private final Boolean isFunction = false;

        private int size;
        private int w;
        private int h;
        private String type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhotoCachedSize extends Api.TypePhotoSize {
        private final Long constructorId = 35527382L;
        private final long subclassOfId = 399256025L;
        private final Boolean isFunction = false;

        private byte bytes;
        private int w;
        private int h;
        private String type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhotoStrippedSize extends Api.TypePhotoSize {
        private final Long constructorId = 3769678894L;
        private final long subclassOfId = 399256025L;
        private final Boolean isFunction = false;

        private byte bytes;
        private String type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhotoSizeProgressive extends Api.TypePhotoSize {
        private final Long constructorId = 4198431637L;
        private final long subclassOfId = 399256025L;
        private final Boolean isFunction = false;

        private int[] sizes;
        private int w;
        private int h;
        private String type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhotoPathSize extends Api.TypePhotoSize {
        private final Long constructorId = 3626061121L;
        private final long subclassOfId = 399256025L;
        private final Boolean isFunction = false;

        private byte bytes;
        private String type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class GeoPointEmpty extends Api.TypeGeoPoint {
        private final Long constructorId = 286776671L;
        private final long subclassOfId = 3591430509L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class GeoPoint extends Api.TypeGeoPoint {
        private final Long constructorId = 2997024355L;
        private final long subclassOfId = 3591430509L;
        private final Boolean isFunction = false;

        private int accuracyRadius;
        private BigInteger accessHash;
        private double longSuffix;
        private double lat;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputNotifyPeer extends Api.TypeInputNotifyPeer {
        private final Long constructorId = 3099351820L;
        private final long subclassOfId = 1486362133L;
        private final Boolean isFunction = false;

        private Api.TypeInputPeer peer;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputNotifyUsers extends Api.TypeInputNotifyPeer {
        private final Long constructorId = 423314455L;
        private final long subclassOfId = 1486362133L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputNotifyChats extends Api.TypeInputNotifyPeer {
        private final Long constructorId = 1251338318L;
        private final long subclassOfId = 1486362133L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputNotifyBroadcasts extends Api.TypeInputNotifyPeer {
        private final Long constructorId = 2983951486L;
        private final long subclassOfId = 1486362133L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPeerNotifySettings extends Api.TypeInputPeerNotifySettings {
        private final Long constructorId = 3743350827L;
        private final long subclassOfId = 2430274317L;
        private final Boolean isFunction = false;

        private Boolean silent;
        private Boolean showPreviews;
        private Api.TypeNotificationSound sound;
        private int muteUntil;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PeerNotifySettings extends Api.TypePeerNotifySettings {
        private final Long constructorId = 2822439974L;
        private final long subclassOfId = 3475030132L;
        private final Boolean isFunction = false;

        private Api.TypeNotificationSound iosSound;
        private Boolean silent;
        private Boolean showPreviews;
        private Api.TypeNotificationSound otherSound;
        private Api.TypeNotificationSound androidSound;
        private int muteUntil;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PeerSettings extends Api.TypePeerSettings {
        private final Long constructorId = 2769817869L;
        private final long subclassOfId = 4138180484L;
        private final Boolean isFunction = false;

        private Boolean reportSpam;
        private int requestChatDate;
        private Boolean shareContact;
        private Boolean blockContact;
        private Boolean autoarchived;
        private Boolean addContact;
        private Boolean inviteMembers;
        private Boolean reportGeo;
        private int geoDistance;
        private Boolean needContactsException;
        private String requestChatTitle;
        private Boolean requestChatBroadcast;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WallPaper extends Api.TypeWallPaper {
        private final Long constructorId = 2755118061L;
        private final long subclassOfId = 2527250827L;
        private final Boolean isFunction = false;

        private Api.TypeWallPaperSettings settings;
        private Boolean creator;
        private Boolean defaultSuffix;
        private Api.TypeDocument document;
        private Boolean pattern;
        private Boolean dark;
        private BigInteger accessHash;
        private BigInteger id;
        private String slug;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WallPaperNoFile extends Api.TypeWallPaper {
        private final Long constructorId = 3766501654L;
        private final long subclassOfId = 2527250827L;
        private final Boolean isFunction = false;

        private Api.TypeWallPaperSettings settings;
        private Boolean defaultSuffix;
        private Boolean dark;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputReportReasonSpam extends Api.TypeReportReason {
        private final Long constructorId = 1490799288L;
        private final long subclassOfId = 2214706471L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputReportReasonViolence extends Api.TypeReportReason {
        private final Long constructorId = 505595789L;
        private final long subclassOfId = 2214706471L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputReportReasonPornography extends Api.TypeReportReason {
        private final Long constructorId = 777640226L;
        private final long subclassOfId = 2214706471L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputReportReasonChildAbuse extends Api.TypeReportReason {
        private final Long constructorId = 2918469347L;
        private final long subclassOfId = 2214706471L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputReportReasonOther extends Api.TypeReportReason {
        private final Long constructorId = 3252986545L;
        private final long subclassOfId = 2214706471L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputReportReasonCopyright extends Api.TypeReportReason {
        private final Long constructorId = 2609510714L;
        private final long subclassOfId = 2214706471L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputReportReasonGeoIrrelevant extends Api.TypeReportReason {
        private final Long constructorId = 3688169197L;
        private final long subclassOfId = 2214706471L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputReportReasonFake extends Api.TypeReportReason {
        private final Long constructorId = 4124956391L;
        private final long subclassOfId = 2214706471L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputReportReasonIllegalDrugs extends Api.TypeReportReason {
        private final Long constructorId = 177124030L;
        private final long subclassOfId = 2214706471L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputReportReasonPersonalDetails extends Api.TypeReportReason {
        private final Long constructorId = 2663876157L;
        private final long subclassOfId = 2214706471L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UserFull extends Api.TypeUserFull {
        private final Long constructorId = 2356341377L;
        private final long subclassOfId = 524706233L;
        private final Boolean isFunction = false;

        private Api.TypePeerSettings settings;
        private int commonChatsCount;
        private Boolean phoneCallsAvailable;
        private Api.TypeChatAdminRights botBroadcastAdminRights;
        private Api.TypeBotInfo botInfo;
        private int pinnedMsgId;
        private String about;
        private Boolean phoneCallsPrivate;
        private Boolean canPinMessage;
        private Api.TypePeerNotifySettings notifySettings;
        private int folderId;
        private String themeEmoticon;
        private Api.TypePhoto profilePhoto;
        private String privateForwardName;
        private Boolean blocked;
        private Boolean videoCallsAvailable;
        private int ttlPeriod;
        private Api.TypeChatAdminRights botGroupAdminRights;
        private BigInteger id;
        private Boolean hasScheduled;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Contact extends Api.TypeContact {
        private final Long constructorId = 341499403L;
        private final long subclassOfId = 2212487076L;
        private final Boolean isFunction = false;

        private Boolean mutual;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ImportedContact extends Api.TypeImportedContact {
        private final Long constructorId = 3242081360L;
        private final long subclassOfId = 3041246170L;
        private final Boolean isFunction = false;

        private BigInteger clientId;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ContactStatus extends Api.TypeContactStatus {
        private final Long constructorId = 383348795L;
        private final long subclassOfId = 1757468492L;
        private final Boolean isFunction = false;

        private BigInteger userId;
        private Api.TypeUserStatus status;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterEmpty extends Api.TypeMessagesFilter {
        private final Long constructorId = 1474492012L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterPhotos extends Api.TypeMessagesFilter {
        private final Long constructorId = 2517214492L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterVideo extends Api.TypeMessagesFilter {
        private final Long constructorId = 2680163941L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterPhotoVideo extends Api.TypeMessagesFilter {
        private final Long constructorId = 1458172132L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterDocument extends Api.TypeMessagesFilter {
        private final Long constructorId = 2665345416L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterUrl extends Api.TypeMessagesFilter {
        private final Long constructorId = 2129714567L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterGif extends Api.TypeMessagesFilter {
        private final Long constructorId = 4291323271L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterVoice extends Api.TypeMessagesFilter {
        private final Long constructorId = 1358283666L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterMusic extends Api.TypeMessagesFilter {
        private final Long constructorId = 928101534L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterChatPhotos extends Api.TypeMessagesFilter {
        private final Long constructorId = 975236280L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterPhoneCalls extends Api.TypeMessagesFilter {
        private final Long constructorId = 2160695144L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

        private Boolean missed;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterRoundVoice extends Api.TypeMessagesFilter {
        private final Long constructorId = 2054952868L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterRoundVideo extends Api.TypeMessagesFilter {
        private final Long constructorId = 3041516115L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterMyMentions extends Api.TypeMessagesFilter {
        private final Long constructorId = 3254314650L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterGeo extends Api.TypeMessagesFilter {
        private final Long constructorId = 3875695885L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterContacts extends Api.TypeMessagesFilter {
        private final Long constructorId = 3764575107L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagesFilterPinned extends Api.TypeMessagesFilter {
        private final Long constructorId = 464520273L;
        private final long subclassOfId = 2318855188L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateNewMessage extends Api.TypeUpdate {
        private final Long constructorId = 522914557L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int ptsCount;
        private Api.TypeMessage message;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateMessageID extends Api.TypeUpdate {
        private final Long constructorId = 1318109142L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private BigInteger randomId;
        private int id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateDeleteMessages extends Api.TypeUpdate {
        private final Long constructorId = 2718806245L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int ptsCount;
        private int[] messages;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateUserTyping extends Api.TypeUpdate {
        private final Long constructorId = 3223225727L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeSendMessageAction action;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChatUserTyping extends Api.TypeUpdate {
        private final Long constructorId = 2202565360L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private BigInteger chatId;
        private Api.TypeSendMessageAction action;
        private Api.TypePeer fromId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChatParticipants extends Api.TypeUpdate {
        private final Long constructorId = 125178264L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeChatParticipants participants;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateUserStatus extends Api.TypeUpdate {
        private final Long constructorId = 3854432478L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private BigInteger userId;
        private Api.TypeUserStatus status;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateUserName extends Api.TypeUpdate {
        private final Long constructorId = 3287417568L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private String firstName;
        private String lastName;
        private BigInteger userId;
        private String username;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateUserPhoto extends Api.TypeUpdate {
        private final Long constructorId = 4062676620L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int date;
        private Boolean previous;
        private Api.TypeUserProfilePhoto photo;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateNewEncryptedMessage extends Api.TypeUpdate {
        private final Long constructorId = 314359194L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int qts;
        private Api.TypeEncryptedMessage message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateEncryptedChatTyping extends Api.TypeUpdate {
        private final Long constructorId = 386986326L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int chatId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateEncryption extends Api.TypeUpdate {
        private final Long constructorId = 3030575245L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int date;
        private Api.TypeEncryptedChat chat;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateEncryptedMessagesRead extends Api.TypeUpdate {
        private final Long constructorId = 956179895L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int date;
        private int chatId;
        private int maxDate;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChatParticipantAdd extends Api.TypeUpdate {
        private final Long constructorId = 1037718609L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger chatId;
        private BigInteger inviterId;
        private BigInteger userId;
        private int version;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChatParticipantDelete extends Api.TypeUpdate {
        private final Long constructorId = 3811523959L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private BigInteger chatId;
        private BigInteger userId;
        private int version;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateDcOptions extends Api.TypeUpdate {
        private final Long constructorId = 2388564083L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeDcOption[] dcOptions;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateNotifySettings extends Api.TypeUpdate {
        private final Long constructorId = 3200411887L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeNotifyPeer peer;
        private Api.TypePeerNotifySettings notifySettings;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateServiceNotification extends Api.TypeUpdate {
        private final Long constructorId = 3957614617L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Boolean popup;
        private Api.TypeMessageEntity[] entities;
        private Api.TypeMessageMedia media;
        private String type;
        private String message;
        private int inboxDate;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatePrivacy extends Api.TypeUpdate {
        private final Long constructorId = 3996854058L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePrivacyRule[] rules;
        private Api.TypePrivacyKey key;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateUserPhone extends Api.TypeUpdate {
        private final Long constructorId = 88680979L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private String phone;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateReadHistoryInbox extends Api.TypeUpdate {
        private final Long constructorId = 2627162079L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int maxId;
        private Api.TypePeer peer;
        private int ptsCount;
        private int folderId;
        private int stillUnreadCount;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateReadHistoryOutbox extends Api.TypeUpdate {
        private final Long constructorId = 791617983L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int maxId;
        private Api.TypePeer peer;
        private int ptsCount;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateWebPage extends Api.TypeUpdate {
        private final Long constructorId = 2139689491L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int ptsCount;
        private Api.TypeWebPage webpage;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateReadMessagesContents extends Api.TypeUpdate {
        private final Long constructorId = 1757493555L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int ptsCount;
        private int[] messages;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChannelTooLong extends Api.TypeUpdate {
        private final Long constructorId = 277713951L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private BigInteger channelId;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChannel extends Api.TypeUpdate {
        private final Long constructorId = 1666927625L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateNewChannelMessage extends Api.TypeUpdate {
        private final Long constructorId = 1656358105L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int ptsCount;
        private Api.TypeMessage message;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateReadChannelInbox extends Api.TypeUpdate {
        private final Long constructorId = 2452516368L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int maxId;
        private int folderId;
        private BigInteger channelId;
        private int stillUnreadCount;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateDeleteChannelMessages extends Api.TypeUpdate {
        private final Long constructorId = 3274529554L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int ptsCount;
        private int[] messages;
        private BigInteger channelId;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChannelMessageViews extends Api.TypeUpdate {
        private final Long constructorId = 4062620680L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int id;
        private BigInteger channelId;
        private int views;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChatParticipantAdmin extends Api.TypeUpdate {
        private final Long constructorId = 3620364706L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private BigInteger chatId;
        private Boolean isAdmin;
        private BigInteger userId;
        private int version;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateNewStickerSet extends Api.TypeUpdate {
        private final Long constructorId = 1753886890L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private MessagesApi.TypeStickerSet stickerset;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateStickerSetsOrder extends Api.TypeUpdate {
        private final Long constructorId = 196268545L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Boolean masks;
        private BigInteger[] order;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateStickerSets extends Api.TypeUpdate {
        private final Long constructorId = 1135492588L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateSavedGifs extends Api.TypeUpdate {
        private final Long constructorId = 2473931806L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateBotInlineQuery extends Api.TypeUpdate {
        private final Long constructorId = 1232025500L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeGeoPoint geo;
        private String offset;
        private String query;
        private Api.TypeInlineQueryPeerType peerType;
        private BigInteger userId;
        private BigInteger queryId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateBotInlineSend extends Api.TypeUpdate {
        private final Long constructorId = 317794823L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeGeoPoint geo;
        private String query;
        private Api.TypeInputBotInlineMessageID msgId;
        private String id;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateEditChannelMessage extends Api.TypeUpdate {
        private final Long constructorId = 457133559L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int ptsCount;
        private Api.TypeMessage message;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateBotCallbackQuery extends Api.TypeUpdate {
        private final Long constructorId = 3117401229L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private byte data;
        private Api.TypePeer peer;
        private int msgId;
        private String gameShortName;
        private BigInteger userId;
        private BigInteger queryId;
        private BigInteger chatInstance;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateEditMessage extends Api.TypeUpdate {
        private final Long constructorId = 3825430691L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int ptsCount;
        private Api.TypeMessage message;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateInlineBotCallbackQuery extends Api.TypeUpdate {
        private final Long constructorId = 1763610706L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private byte data;
        private Api.TypeInputBotInlineMessageID msgId;
        private String gameShortName;
        private BigInteger userId;
        private BigInteger queryId;
        private BigInteger chatInstance;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateReadChannelOutbox extends Api.TypeUpdate {
        private final Long constructorId = 3076495785L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int maxId;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateDraftMessage extends Api.TypeUpdate {
        private final Long constructorId = 3995842921L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
        private Api.TypeDraftMessage draft;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateReadFeaturedStickers extends Api.TypeUpdate {
        private final Long constructorId = 1461528386L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateRecentStickers extends Api.TypeUpdate {
        private final Long constructorId = 2588027936L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateConfig extends Api.TypeUpdate {
        private final Long constructorId = 2720652550L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatePtsChanged extends Api.TypeUpdate {
        private final Long constructorId = 861169551L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChannelWebPage extends Api.TypeUpdate {
        private final Long constructorId = 791390623L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int ptsCount;
        private Api.TypeWebPage webpage;
        private BigInteger channelId;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateDialogPinned extends Api.TypeUpdate {
        private final Long constructorId = 1852826908L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Boolean pinned;
        private Api.TypeDialogPeer peer;
        private int folderId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatePinnedDialogs extends Api.TypeUpdate {
        private final Long constructorId = 4195302562L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int folderId;
        private Api.TypeDialogPeer[] order;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateBotWebhookJSON extends Api.TypeUpdate {
        private final Long constructorId = 2199371971L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeDataJSON data;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateBotWebhookJSONQuery extends Api.TypeUpdate {
        private final Long constructorId = 2610053286L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeDataJSON data;
        private int timeout;
        private BigInteger queryId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateBotShippingQuery extends Api.TypeUpdate {
        private final Long constructorId = 3048144253L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private byte payload;
        private Api.TypePostAddress shippingAddress;
        private BigInteger userId;
        private BigInteger queryId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateBotPrecheckoutQuery extends Api.TypeUpdate {
        private final Long constructorId = 2359990934L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private BigInteger totalAmount;
        private byte payload;
        private String currency;
        private String shippingOptionId;
        private BigInteger userId;
        private BigInteger queryId;
        private Api.TypePaymentRequestedInfo info;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatePhoneCall extends Api.TypeUpdate {
        private final Long constructorId = 2869914398L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePhoneCall phoneCall;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateLangPackTooLong extends Api.TypeUpdate {
        private final Long constructorId = 1180041828L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private String langCode;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateLangPack extends Api.TypeUpdate {
        private final Long constructorId = 1442983757L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeLangPackDifference difference;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateFavedStickers extends Api.TypeUpdate {
        private final Long constructorId = 3843135853L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChannelReadMessagesContents extends Api.TypeUpdate {
        private final Long constructorId = 1153291573L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int[] messages;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateContactsReset extends Api.TypeUpdate {
        private final Long constructorId = 1887741886L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChannelAvailableMessages extends Api.TypeUpdate {
        private final Long constructorId = 2990524056L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int availableMinId;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateDialogUnreadMark extends Api.TypeUpdate {
        private final Long constructorId = 3781450179L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Boolean unread;
        private Api.TypeDialogPeer peer;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateMessagePoll extends Api.TypeUpdate {
        private final Long constructorId = 2896258427L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private BigInteger pollId;
        private Api.TypePoll poll;
        private Api.TypePollResults results;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChatDefaultBannedRights extends Api.TypeUpdate {
        private final Long constructorId = 1421875280L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
        private Api.TypeChatBannedRights defaultBannedRights;
        private int version;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateFolderPeers extends Api.TypeUpdate {
        private final Long constructorId = 422972864L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeFolderPeer[] folderPeers;
        private int ptsCount;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatePeerSettings extends Api.TypeUpdate {
        private final Long constructorId = 1786671974L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePeerSettings settings;
        private Api.TypePeer peer;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatePeerLocated extends Api.TypeUpdate {
        private final Long constructorId = 3031420848L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePeerLocated[] peers;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateNewScheduledMessage extends Api.TypeUpdate {
        private final Long constructorId = 967122427L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeMessage message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateDeleteScheduledMessages extends Api.TypeUpdate {
        private final Long constructorId = 2424728814L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
        private int[] messages;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateTheme extends Api.TypeUpdate {
        private final Long constructorId = 2182544291L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeTheme theme;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateGeoLiveViewed extends Api.TypeUpdate {
        private final Long constructorId = 2267003193L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
        private int msgId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateLoginToken extends Api.TypeUpdate {
        private final Long constructorId = 1448076945L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateMessagePollVote extends Api.TypeUpdate {
        private final Long constructorId = 274961865L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int qts;
        private BigInteger pollId;
        private byte[] options;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateDialogFilter extends Api.TypeUpdate {
        private final Long constructorId = 654302845L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeDialogFilter filter;
        private int id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateDialogFilterOrder extends Api.TypeUpdate {
        private final Long constructorId = 2782339333L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int[] order;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateDialogFilters extends Api.TypeUpdate {
        private final Long constructorId = 889491791L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatePhoneCallSignalingData extends Api.TypeUpdate {
        private final Long constructorId = 643940105L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private BigInteger phoneCallId;
        private byte data;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChannelMessageForwards extends Api.TypeUpdate {
        private final Long constructorId = 3533318132L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int forwards;
        private int id;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateReadChannelDiscussionInbox extends Api.TypeUpdate {
        private final Long constructorId = 3601962310L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int broadcastPost;
        private int readMaxId;
        private BigInteger broadcastId;
        private int topMsgId;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateReadChannelDiscussionOutbox extends Api.TypeUpdate {
        private final Long constructorId = 1767677564L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int readMaxId;
        private int topMsgId;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatePeerBlocked extends Api.TypeUpdate {
        private final Long constructorId = 610945826L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePeer peerId;
        private Boolean blocked;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChannelUserTyping extends Api.TypeUpdate {
        private final Long constructorId = 2357774627L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeSendMessageAction action;
        private int topMsgId;
        private Api.TypePeer fromId;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatePinnedMessages extends Api.TypeUpdate {
        private final Long constructorId = 3984976565L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Boolean pinned;
        private Api.TypePeer peer;
        private int ptsCount;
        private int[] messages;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatePinnedChannelMessages extends Api.TypeUpdate {
        private final Long constructorId = 1538885128L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Boolean pinned;
        private int ptsCount;
        private int[] messages;
        private BigInteger channelId;
        private int pts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChat extends Api.TypeUpdate {
        private final Long constructorId = 4170869326L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private BigInteger chatId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateGroupCallParticipants extends Api.TypeUpdate {
        private final Long constructorId = 4075543374L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeInputGroupCall call;
        private int version;
        private Api.TypeGroupCallParticipant[] participants;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateGroupCall extends Api.TypeUpdate {
        private final Long constructorId = 347227392L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeGroupCall call;
        private BigInteger chatId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatePeerHistoryTTL extends Api.TypeUpdate {
        private final Long constructorId = 3147544997L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
        private int ttlPeriod;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChatParticipant extends Api.TypeUpdate {
        private final Long constructorId = 3498534458L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int date;
        private int qts;
        private BigInteger actorId;
        private BigInteger chatId;
        private Api.TypeChatParticipant newParticipant;
        private Api.TypeExportedChatInvite invite;
        private BigInteger userId;
        private Api.TypeChatParticipant prevParticipant;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateChannelParticipant extends Api.TypeUpdate {
        private final Long constructorId = 2556246715L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int date;
        private int qts;
        private BigInteger actorId;
        private Api.TypeChannelParticipant newParticipant;
        private Api.TypeExportedChatInvite invite;
        private BigInteger userId;
        private Api.TypeChannelParticipant prevParticipant;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateBotStopped extends Api.TypeUpdate {
        private final Long constructorId = 3297184329L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int date;
        private int qts;
        private Boolean stopped;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateGroupCallConnection extends Api.TypeUpdate {
        private final Long constructorId = 192428418L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Boolean presentation;
        private Api.TypeDataJSON params;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateBotCommands extends Api.TypeUpdate {
        private final Long constructorId = 1299263278L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
        private BigInteger botId;
        private Api.TypeBotCommand[] commands;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatePendingJoinRequests extends Api.TypeUpdate {
        private final Long constructorId = 1885586395L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int requestsPending;
        private Api.TypePeer peer;
        private BigInteger[] recentRequesters;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateBotChatInviteRequester extends Api.TypeUpdate {
        private final Long constructorId = 299870598L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private int date;
        private int qts;
        private Api.TypePeer peer;
        private String about;
        private Api.TypeExportedChatInvite invite;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateMessageReactions extends Api.TypeUpdate {
        private final Long constructorId = 357013699L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
        private int msgId;
        private Api.TypeMessageReactions reactions;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateAttachMenuBots extends Api.TypeUpdate {
        private final Long constructorId = 397910539L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateWebViewResultSent extends Api.TypeUpdate {
        private final Long constructorId = 361936797L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private BigInteger queryId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateBotMenuButton extends Api.TypeUpdate {
        private final Long constructorId = 347625491L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypeBotMenuButton button;
        private BigInteger botId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateSavedRingtones extends Api.TypeUpdate {
        private final Long constructorId = 1960361625L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateTranscribedAudio extends Api.TypeUpdate {
        private final Long constructorId = 8703322L;
        private final long subclassOfId = 2676568142L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
        private Boolean pending;
        private BigInteger transcriptionId;
        private int msgId;
        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatesTooLong extends Api.TypeUpdates {
        private final Long constructorId = 3809980286L;
        private final long subclassOfId = 2331323052L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateShortMessage extends Api.TypeUpdates {
        private final Long constructorId = 826001400L;
        private final long subclassOfId = 2331323052L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger viaBotId;
        private Boolean silent;
        private String message;
        private BigInteger userId;
        private int pts;
        private Boolean out;
        private Boolean mediaUnread;
        private Api.TypeMessageFwdHeader fwdFrom;
        private Api.TypeMessageEntity[] entities;
        private int ptsCount;
        private Api.TypeMessageReplyHeader replyTo;
        private int ttlPeriod;
        private int id;
        private Boolean mentioned;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateShortChatMessage extends Api.TypeUpdates {
        private final Long constructorId = 1299050149L;
        private final long subclassOfId = 2331323052L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger viaBotId;
        private Boolean silent;
        private BigInteger chatId;
        private String message;
        private BigInteger fromId;
        private int pts;
        private Boolean out;
        private Boolean mediaUnread;
        private Api.TypeMessageFwdHeader fwdFrom;
        private Api.TypeMessageEntity[] entities;
        private int ptsCount;
        private Api.TypeMessageReplyHeader replyTo;
        private int ttlPeriod;
        private int id;
        private Boolean mentioned;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateShort extends Api.TypeUpdates {
        private final Long constructorId = 2027216577L;
        private final long subclassOfId = 2331323052L;
        private final Boolean isFunction = false;

        private int date;
        private Api.TypeUpdate update;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdatesCombined extends Api.TypeUpdates {
        private final Long constructorId = 1918567619L;
        private final long subclassOfId = 2331323052L;
        private final Boolean isFunction = false;

        private int date;
        private int seqStart;
        private Api.TypeChat[] chats;
        private Api.TypeUpdate[] updates;
        private Api.TypeUser[] users;
        private int seq;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Updates extends Api.TypeUpdates {
        private final Long constructorId = 1957577280L;
        private final long subclassOfId = 2331323052L;
        private final Boolean isFunction = false;

        private int date;
        private Api.TypeChat[] chats;
        private Api.TypeUpdate[] updates;
        private Api.TypeUser[] users;
        private int seq;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UpdateShortSentMessage extends Api.TypeUpdates {
        private final Long constructorId = 2417352961L;
        private final long subclassOfId = 2331323052L;
        private final Boolean isFunction = false;

        private int date;
        private Api.TypeMessageEntity[] entities;
        private int ptsCount;
        private int ttlPeriod;
        private int id;
        private Api.TypeMessageMedia media;
        private int pts;
        private Boolean out;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DcOption extends Api.TypeDcOption {
        private final Long constructorId = 414687501L;
        private final long subclassOfId = 2655248675L;
        private final Boolean isFunction = false;

        private Boolean mediaOnly;
        private Boolean staticSuffix;
        private int port;
        private Boolean ipv6;
        private String ipAddress;
        private Boolean tcpoOnly;
        private int id;
        private byte secret;
        private Boolean cdn;
        private Boolean thisPortOnly;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Config extends Api.TypeConfig {
        private final Long constructorId = 856375399L;
        private final long subclassOfId = 3542493770L;
        private final Boolean isFunction = false;

        private int date;
        private int pinnedDialogsCountMax;
        private Boolean forceTryIpv6;
        private int callConnectTimeoutMs;
        private int onlineCloudTimeoutMs;
        private int pushChatPeriodMs;
        private Boolean pfsEnabled;
        private Api.TypeDcOption[] dcOptions;
        private String gifSearchUsername;
        private int notifyCloudDelayMs;
        private int callRingTimeoutMs;
        private int notifyDefaultDelayMs;
        private int pinnedInfolderCountMax;
        private int callReceiveTimeoutMs;
        private int tmpSessions;
        private String venueSearchUsername;
        private int captionLengthMax;
        private int forwardedCountMax;
        private Boolean blockedMode;
        private int revokePmTimeLimit;
        private int megagroupSizeMax;
        private int messageLengthMax;
        private int stickersRecentLimit;
        private int onlineUpdatePeriodMs;
        private int editTimeLimit;
        private int expires;
        private Boolean phonecallsEnabled;
        private int stickersFavedLimit;
        private int savedGifsLimit;
        private String dcTxtDomainName;
        private String imgSearchUsername;
        private int revokeTimeLimit;
        private Boolean defaultP2pContacts;
        private int pushChatLimit;
        private String suggestedLangCode;
        private String meUrlPrefix;
        private int chatSizeMax;
        private int langPackVersion;
        private int thisDc;
        private int callPacketTimeoutMs;
        private Boolean preloadFeaturedStickers;
        private Boolean revokePmInbox;
        private int offlineBlurTimeoutMs;
        private int webfileDcId;
        private Boolean ignorePhoneEntities;
        private Boolean testMode;
        private int channelsReadMediaPeriod;
        private int ratingEDecay;
        private String autoupdateUrlPrefix;
        private int baseLangPackVersion;
        private int offlineIdleTimeoutMs;
        private String staticMapsProvider;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class NearestDc extends Api.TypeNearestDc {
        private final Long constructorId = 2384074613L;
        private final long subclassOfId = 947323999L;
        private final Boolean isFunction = false;

        private int thisDc;
        private String country;
        private int nearestDc;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EncryptedChatEmpty extends Api.TypeEncryptedChat {
        private final Long constructorId = 2877210784L;
        private final long subclassOfId = 1831379834L;
        private final Boolean isFunction = false;

        private int id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EncryptedChatWaiting extends Api.TypeEncryptedChat {
        private final Long constructorId = 1722964307L;
        private final long subclassOfId = 1831379834L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger participantId;
        private BigInteger adminId;
        private BigInteger accessHash;
        private int id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EncryptedChatRequested extends Api.TypeEncryptedChat {
        private final Long constructorId = 1223809356L;
        private final long subclassOfId = 1831379834L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger participantId;
        private BigInteger adminId;
        private BigInteger accessHash;
        private byte gA;
        private int id;
        private int folderId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EncryptedChat extends Api.TypeEncryptedChat {
        private final Long constructorId = 1643173063L;
        private final long subclassOfId = 1831379834L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger participantId;
        private BigInteger keyFingerprint;
        private BigInteger adminId;
        private BigInteger accessHash;
        private int id;
        private byte gAOrB;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EncryptedChatDiscarded extends Api.TypeEncryptedChat {
        private final Long constructorId = 505183301L;
        private final long subclassOfId = 1831379834L;
        private final Boolean isFunction = false;

        private int id;
        private Boolean historyDeleted;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputEncryptedChat extends Api.TypeInputEncryptedChat {
        private final Long constructorId = 4047615457L;
        private final long subclassOfId = 1819674304L;
        private final Boolean isFunction = false;

        private int chatId;
        private BigInteger accessHash;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EncryptedFileEmpty extends Api.TypeEncryptedFile {
        private final Long constructorId = 3256830334L;
        private final long subclassOfId = 2217371584L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EncryptedFile extends Api.TypeEncryptedFile {
        private final Long constructorId = 2818608344L;
        private final long subclassOfId = 2217371584L;
        private final Boolean isFunction = false;

        private BigInteger size;
        private int dcId;
        private int keyFingerprint;
        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputEncryptedFileEmpty extends Api.TypeInputEncryptedFile {
        private final Long constructorId = 406307684L;
        private final long subclassOfId = 2239021690L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputEncryptedFileUploaded extends Api.TypeInputEncryptedFile {
        private final Long constructorId = 1690108678L;
        private final long subclassOfId = 2239021690L;
        private final Boolean isFunction = false;

        private String md5Checksum;
        private int keyFingerprint;
        private int parts;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputEncryptedFile extends Api.TypeInputEncryptedFile {
        private final Long constructorId = 1511503333L;
        private final long subclassOfId = 2239021690L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputEncryptedFileBigUploaded extends Api.TypeInputEncryptedFile {
        private final Long constructorId = 767652808L;
        private final long subclassOfId = 2239021690L;
        private final Boolean isFunction = false;

        private int keyFingerprint;
        private int parts;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EncryptedMessage extends Api.TypeEncryptedMessage {
        private final Long constructorId = 3977822488L;
        private final long subclassOfId = 597634641L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger randomId;
        private Api.TypeEncryptedFile file;
        private int chatId;
        private byte bytes;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EncryptedMessageService extends Api.TypeEncryptedMessage {
        private final Long constructorId = 594758406L;
        private final long subclassOfId = 597634641L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger randomId;
        private int chatId;
        private byte bytes;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputDocumentEmpty extends Api.TypeInputDocument {
        private final Long constructorId = 1928391342L;
        private final long subclassOfId = 4081048424L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputDocument extends Api.TypeInputDocument {
        private final Long constructorId = 448771445L;
        private final long subclassOfId = 4081048424L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger id;
        private byte fileReference;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DocumentEmpty extends Api.TypeDocument {
        private final Long constructorId = 922273905L;
        private final long subclassOfId = 555739168L;
        private final Boolean isFunction = false;

        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Document extends Api.TypeDocument {
        private final Long constructorId = 2413085912L;
        private final long subclassOfId = 555739168L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger size;
        private int dcId;
        private BigInteger accessHash;
        private Api.TypeDocumentAttribute[] attributes;
        private BigInteger id;
        private String mimeType;
        private byte fileReference;
        private Api.TypePhotoSize[] thumbs;
        private Api.TypeVideoSize[] videoThumbs;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class NotifyPeer extends Api.TypeNotifyPeer {
        private final Long constructorId = 2681474008L;
        private final long subclassOfId = 3756548142L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class NotifyUsers extends Api.TypeNotifyPeer {
        private final Long constructorId = 3033021260L;
        private final long subclassOfId = 3756548142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class NotifyChats extends Api.TypeNotifyPeer {
        private final Long constructorId = 3221737155L;
        private final long subclassOfId = 3756548142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class NotifyBroadcasts extends Api.TypeNotifyPeer {
        private final Long constructorId = 3591563503L;
        private final long subclassOfId = 3756548142L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageTypingAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 381645902L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageCancelAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 4250847477L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageRecordVideoAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 2710034031L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageUploadVideoAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 3916839660L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

        private int progress;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageRecordAudioAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 3576656887L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageUploadAudioAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 4082227115L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

        private int progress;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageUploadPhotoAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 3520285222L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

        private int progress;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageUploadDocumentAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 2852968932L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

        private int progress;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageGeoLocationAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 393186209L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageChooseContactAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 1653390447L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageGamePlayAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 3714748232L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageRecordRoundAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 2297593788L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageUploadRoundAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 608050278L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

        private int progress;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SpeakingInGroupCallAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 3643548293L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageHistoryImportAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 3688534598L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

        private int progress;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageChooseStickerAction extends Api.TypeSendMessageAction {
        private final Long constructorId = 2958739121L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageEmojiInteraction extends Api.TypeSendMessageAction {
        private final Long constructorId = 630664139L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

        private Api.TypeDataJSON interaction;
        private int msgId;
        private String emoticon;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SendMessageEmojiInteractionSeen extends Api.TypeSendMessageAction {
        private final Long constructorId = 3060109358L;
        private final long subclassOfId = 548588577L;
        private final Boolean isFunction = false;

        private String emoticon;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyKeyStatusTimestamp extends Api.TypeInputPrivacyKey {
        private final Long constructorId = 1335282456L;
        private final long subclassOfId = 87435256L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyKeyChatInvite extends Api.TypeInputPrivacyKey {
        private final Long constructorId = 3187344422L;
        private final long subclassOfId = 87435256L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyKeyPhoneCall extends Api.TypeInputPrivacyKey {
        private final Long constructorId = 4206550111L;
        private final long subclassOfId = 87435256L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyKeyPhoneP2P extends Api.TypeInputPrivacyKey {
        private final Long constructorId = 3684593874L;
        private final long subclassOfId = 87435256L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyKeyForwards extends Api.TypeInputPrivacyKey {
        private final Long constructorId = 2765966344L;
        private final long subclassOfId = 87435256L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyKeyProfilePhoto extends Api.TypeInputPrivacyKey {
        private final Long constructorId = 1461304012L;
        private final long subclassOfId = 87435256L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyKeyPhoneNumber extends Api.TypeInputPrivacyKey {
        private final Long constructorId = 55761658L;
        private final long subclassOfId = 87435256L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyKeyAddedByPhone extends Api.TypeInputPrivacyKey {
        private final Long constructorId = 3508640733L;
        private final long subclassOfId = 87435256L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyKeyStatusTimestamp extends Api.TypePrivacyKey {
        private final Long constructorId = 3157175088L;
        private final long subclassOfId = 2185646531L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyKeyChatInvite extends Api.TypePrivacyKey {
        private final Long constructorId = 1343122938L;
        private final long subclassOfId = 2185646531L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyKeyPhoneCall extends Api.TypePrivacyKey {
        private final Long constructorId = 1030105979L;
        private final long subclassOfId = 2185646531L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyKeyPhoneP2P extends Api.TypePrivacyKey {
        private final Long constructorId = 961092808L;
        private final long subclassOfId = 2185646531L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyKeyForwards extends Api.TypePrivacyKey {
        private final Long constructorId = 1777096355L;
        private final long subclassOfId = 2185646531L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyKeyProfilePhoto extends Api.TypePrivacyKey {
        private final Long constructorId = 2517966829L;
        private final long subclassOfId = 2185646531L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyKeyPhoneNumber extends Api.TypePrivacyKey {
        private final Long constructorId = 3516589165L;
        private final long subclassOfId = 2185646531L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyKeyAddedByPhone extends Api.TypePrivacyKey {
        private final Long constructorId = 1124062251L;
        private final long subclassOfId = 2185646531L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyValueAllowContacts extends Api.TypeInputPrivacyRule {
        private final Long constructorId = 218751099L;
        private final long subclassOfId = 1513843490L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyValueAllowAll extends Api.TypeInputPrivacyRule {
        private final Long constructorId = 407582158L;
        private final long subclassOfId = 1513843490L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyValueAllowUsers extends Api.TypeInputPrivacyRule {
        private final Long constructorId = 320652927L;
        private final long subclassOfId = 1513843490L;
        private final Boolean isFunction = false;

        private Api.TypeInputUser[] users;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyValueDisallowContacts extends Api.TypeInputPrivacyRule {
        private final Long constructorId = 195371015L;
        private final long subclassOfId = 1513843490L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyValueDisallowAll extends Api.TypeInputPrivacyRule {
        private final Long constructorId = 3597362889L;
        private final long subclassOfId = 1513843490L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyValueDisallowUsers extends Api.TypeInputPrivacyRule {
        private final Long constructorId = 2417034343L;
        private final long subclassOfId = 1513843490L;
        private final Boolean isFunction = false;

        private Api.TypeInputUser[] users;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyValueAllowChatParticipants extends Api.TypeInputPrivacyRule {
        private final Long constructorId = 2215004623L;
        private final long subclassOfId = 1513843490L;
        private final Boolean isFunction = false;

        private BigInteger[] chats;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPrivacyValueDisallowChatParticipants extends Api.TypeInputPrivacyRule {
        private final Long constructorId = 3914272646L;
        private final long subclassOfId = 1513843490L;
        private final Boolean isFunction = false;

        private BigInteger[] chats;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyValueAllowContacts extends Api.TypePrivacyRule {
        private final Long constructorId = 4294843308L;
        private final long subclassOfId = 3954700912L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyValueAllowAll extends Api.TypePrivacyRule {
        private final Long constructorId = 1698855810L;
        private final long subclassOfId = 3954700912L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyValueAllowUsers extends Api.TypePrivacyRule {
        private final Long constructorId = 3096469426L;
        private final long subclassOfId = 3954700912L;
        private final Boolean isFunction = false;

        private BigInteger[] users;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyValueDisallowContacts extends Api.TypePrivacyRule {
        private final Long constructorId = 4169726490L;
        private final long subclassOfId = 3954700912L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyValueDisallowAll extends Api.TypePrivacyRule {
        private final Long constructorId = 2339628899L;
        private final long subclassOfId = 3954700912L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyValueDisallowUsers extends Api.TypePrivacyRule {
        private final Long constructorId = 3831632193L;
        private final long subclassOfId = 3954700912L;
        private final Boolean isFunction = false;

        private BigInteger[] users;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyValueAllowChatParticipants extends Api.TypePrivacyRule {
        private final Long constructorId = 1796427406L;
        private final long subclassOfId = 3954700912L;
        private final Boolean isFunction = false;

        private BigInteger[] chats;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PrivacyValueDisallowChatParticipants extends Api.TypePrivacyRule {
        private final Long constructorId = 1103656293L;
        private final long subclassOfId = 3954700912L;
        private final Boolean isFunction = false;

        private BigInteger[] chats;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AccountDaysTTL extends Api.TypeAccountDaysTTL {
        private final Long constructorId = 3100684255L;
        private final long subclassOfId = 3131284872L;
        private final Boolean isFunction = false;

        private int days;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DocumentAttributeImageSize extends Api.TypeDocumentAttribute {
        private final Long constructorId = 1815593308L;
        private final long subclassOfId = 4146719643L;
        private final Boolean isFunction = false;

        private int w;
        private int h;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DocumentAttributeAnimated extends Api.TypeDocumentAttribute {
        private final Long constructorId = 297109817L;
        private final long subclassOfId = 4146719643L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DocumentAttributeSticker extends Api.TypeDocumentAttribute {
        private final Long constructorId = 1662637586L;
        private final long subclassOfId = 4146719643L;
        private final Boolean isFunction = false;

        private Api.TypeMaskCoords maskCoords;
        private String alt;
        private Api.TypeInputStickerSet stickerset;
        private Boolean mask;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DocumentAttributeVideo extends Api.TypeDocumentAttribute {
        private final Long constructorId = 250621158L;
        private final long subclassOfId = 4146719643L;
        private final Boolean isFunction = false;

        private int duration;
        private Boolean supportsStreaming;
        private int w;
        private int h;
        private Boolean roundMessage;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DocumentAttributeAudio extends Api.TypeDocumentAttribute {
        private final Long constructorId = 2555574726L;
        private final long subclassOfId = 4146719643L;
        private final Boolean isFunction = false;

        private Boolean voice;
        private int duration;
        private String performer;
        private String title;
        private byte waveform;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DocumentAttributeFilename extends Api.TypeDocumentAttribute {
        private final Long constructorId = 358154344L;
        private final long subclassOfId = 4146719643L;
        private final Boolean isFunction = false;

        private String fileName;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DocumentAttributeHasStickers extends Api.TypeDocumentAttribute {
        private final Long constructorId = 2550256375L;
        private final long subclassOfId = 4146719643L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StickerPack extends Api.TypeStickerPack {
        private final Long constructorId = 313694676L;
        private final long subclassOfId = 2683282644L;
        private final Boolean isFunction = false;

        private BigInteger[] documents;
        private String emoticon;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WebPageEmpty extends Api.TypeWebPage {
        private final Long constructorId = 3943987176L;
        private final long subclassOfId = 1437168769L;
        private final Boolean isFunction = false;

        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WebPagePending extends Api.TypeWebPage {
        private final Long constructorId = 3313949212L;
        private final long subclassOfId = 1437168769L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WebPage extends Api.TypeWebPage {
        private final Long constructorId = 3902555570L;
        private final long subclassOfId = 1437168769L;
        private final Boolean isFunction = false;

        private String embedUrl;
        private Api.TypePage cachedPage;
        private String author;
        private Api.TypeDocument document;
        private int embedWidth;
        private String siteName;
        private String description;
        private Api.TypePhoto photo;
        private String type;
        private String title;
        private String url;
        private String displayUrl;
        private int duration;
        private int embedHeight;
        private String embedType;
        private Api.TypeWebPageAttribute[] attributes;
        private BigInteger id;
        private int hash;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WebPageNotModified extends Api.TypeWebPage {
        private final Long constructorId = 1930545681L;
        private final long subclassOfId = 1437168769L;
        private final Boolean isFunction = false;

        private int cachedPageViews;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Authorization extends Api.TypeAuthorization {
        private final Long constructorId = 2902578717L;
        private final long subclassOfId = 3373514778L;
        private final Boolean isFunction = false;

        private String country;
        private String appVersion;
        private int dateActive;
        private String appName;
        private String ip;
        private Boolean passwordPending;
        private String systemVersion;
        private String platform;
        private Boolean current;
        private Boolean encryptedRequestsDisabled;
        private int dateCreated;
        private Boolean callRequestsDisabled;
        private String deviceModel;
        private Boolean officialApp;
        private String region;
        private BigInteger hash;
        private int apiId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ReceivedNotifyMessage extends Api.TypeReceivedNotifyMessage {
        private final Long constructorId = 2743383929L;
        private final long subclassOfId = 2841786398L;
        private final Boolean isFunction = false;

        private int id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatInviteExported extends Api.TypeExportedChatInvite {
        private final Long constructorId = 179611673L;
        private final long subclassOfId = 3027536472L;
        private final Boolean isFunction = false;

        private int date;
        private Boolean requestNeeded;
        private int usageLimit;
        private int usage;
        private String link;
        private Boolean revoked;
        private String title;
        private int requested;
        private Boolean permanent;
        private BigInteger adminId;
        private int expireDate;
        private int startDate;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatInvitePublicJoinRequests extends Api.TypeExportedChatInvite {
        private final Long constructorId = 3977280183L;
        private final long subclassOfId = 3027536472L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatInviteAlready extends Api.TypeChatInvite {
        private final Long constructorId = 1516793212L;
        private final long subclassOfId = 72750902L;
        private final Boolean isFunction = false;

        private Api.TypeChat chat;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatInvite extends Api.TypeChatInvite {
        private final Long constructorId = 806110401L;
        private final long subclassOfId = 72750902L;
        private final Boolean isFunction = false;

        private Boolean broadcast;
        private Boolean requestNeeded;
        private int participantsCount;
        private Boolean publicSuffix;
        private Boolean channel;
        private String about;
        private Api.TypePhoto photo;
        private String title;
        private Boolean megagroup;
        private Api.TypeUser[] participants;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatInvitePeek extends Api.TypeChatInvite {
        private final Long constructorId = 1634294960L;
        private final long subclassOfId = 72750902L;
        private final Boolean isFunction = false;

        private int expires;
        private Api.TypeChat chat;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputStickerSetEmpty extends Api.TypeInputStickerSet {
        private final Long constructorId = 4290128789L;
        private final long subclassOfId = 1034127786L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputStickerSetID extends Api.TypeInputStickerSet {
        private final Long constructorId = 2649203305L;
        private final long subclassOfId = 1034127786L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputStickerSetShortName extends Api.TypeInputStickerSet {
        private final Long constructorId = 2250033312L;
        private final long subclassOfId = 1034127786L;
        private final Boolean isFunction = false;

        private String shortName;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputStickerSetAnimatedEmoji extends Api.TypeInputStickerSet {
        private final Long constructorId = 42402760L;
        private final long subclassOfId = 1034127786L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputStickerSetDice extends Api.TypeInputStickerSet {
        private final Long constructorId = 3867103758L;
        private final long subclassOfId = 1034127786L;
        private final Boolean isFunction = false;

        private String emoticon;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputStickerSetAnimatedEmojiAnimations extends Api.TypeInputStickerSet {
        private final Long constructorId = 215889721L;
        private final long subclassOfId = 1034127786L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StickerSet extends Api.TypeStickerSet {
        private final Long constructorId = 3621724538L;
        private final long subclassOfId = 3134455697L;
        private final Boolean isFunction = false;

        private int count;
        private Boolean official;
        private Boolean masks;
        private Boolean videos;
        private int thumbDcId;
        private String title;
        private Boolean archived;
        private int installedDate;
        private Boolean animated;
        private BigInteger accessHash;
        private BigInteger id;
        private String shortName;
        private int thumbVersion;
        private int hash;
        private Api.TypePhotoSize[] thumbs;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotCommand extends Api.TypeBotCommand {
        private final Long constructorId = 3262826695L;
        private final long subclassOfId = 236872386L;
        private final Boolean isFunction = false;

        private String description;
        private String command;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotInfo extends Api.TypeBotInfo {
        private final Long constructorId = 2402290519L;
        private final long subclassOfId = 4059496923L;
        private final Boolean isFunction = false;

        private Api.TypeDocument descriptionDocument;
        private Api.TypePhoto descriptionPhoto;
        private Api.TypeBotMenuButton menuButton;
        private String description;
        private BigInteger userId;
        private Api.TypeBotCommand[] commands;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButton extends Api.TypeKeyboardButton {
        private final Long constructorId = 2734311552L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonUrl extends Api.TypeKeyboardButton {
        private final Long constructorId = 629866245L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private String text;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonCallback extends Api.TypeKeyboardButton {
        private final Long constructorId = 901503851L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private Boolean requiresPassword;
        private byte data;
        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonRequestPhone extends Api.TypeKeyboardButton {
        private final Long constructorId = 2976541737L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonRequestGeoLocation extends Api.TypeKeyboardButton {
        private final Long constructorId = 4235815743L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonSwitchInline extends Api.TypeKeyboardButton {
        private final Long constructorId = 90744648L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private Boolean samePeer;
        private String query;
        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonGame extends Api.TypeKeyboardButton {
        private final Long constructorId = 1358175439L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonBuy extends Api.TypeKeyboardButton {
        private final Long constructorId = 2950250427L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonUrlAuth extends Api.TypeKeyboardButton {
        private final Long constructorId = 280464681L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private String fwdText;
        private int buttonId;
        private String text;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputKeyboardButtonUrlAuth extends Api.TypeKeyboardButton {
        private final Long constructorId = 3492708308L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private String fwdText;
        private Api.TypeInputUser bot;
        private String text;
        private Boolean requestWriteAccess;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonRequestPoll extends Api.TypeKeyboardButton {
        private final Long constructorId = 3150401885L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private Boolean quiz;
        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputKeyboardButtonUserProfile extends Api.TypeKeyboardButton {
        private final Long constructorId = 3918005115L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private String text;
        private Api.TypeInputUser userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonUserProfile extends Api.TypeKeyboardButton {
        private final Long constructorId = 814112961L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private String text;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonWebView extends Api.TypeKeyboardButton {
        private final Long constructorId = 326529584L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private String text;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonSimpleWebView extends Api.TypeKeyboardButton {
        private final Long constructorId = 2696958044L;
        private final long subclassOfId = 195916963L;
        private final Boolean isFunction = false;

        private String text;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class KeyboardButtonRow extends Api.TypeKeyboardButtonRow {
        private final Long constructorId = 2002815875L;
        private final long subclassOfId = 2222403758L;
        private final Boolean isFunction = false;

        private Api.TypeKeyboardButton[] buttons;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ReplyKeyboardHide extends Api.TypeReplyMarkup {
        private final Long constructorId = 2688441221L;
        private final long subclassOfId = 3806400242L;
        private final Boolean isFunction = false;

        private Boolean selective;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ReplyKeyboardForceReply extends Api.TypeReplyMarkup {
        private final Long constructorId = 2259946248L;
        private final long subclassOfId = 3806400242L;
        private final Boolean isFunction = false;

        private Boolean singleUse;
        private Boolean selective;
        private String placeholder;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ReplyKeyboardMarkup extends Api.TypeReplyMarkup {
        private final Long constructorId = 2245892561L;
        private final long subclassOfId = 3806400242L;
        private final Boolean isFunction = false;

        private Boolean singleUse;
        private Boolean selective;
        private Boolean resize;
        private String placeholder;
        private Api.TypeKeyboardButtonRow[] rows;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ReplyInlineMarkup extends Api.TypeReplyMarkup {
        private final Long constructorId = 1218642516L;
        private final long subclassOfId = 3806400242L;
        private final Boolean isFunction = false;

        private Api.TypeKeyboardButtonRow[] rows;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityUnknown extends Api.TypeMessageEntity {
        private final Long constructorId = 3146955413L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityMention extends Api.TypeMessageEntity {
        private final Long constructorId = 4194588573L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityHashtag extends Api.TypeMessageEntity {
        private final Long constructorId = 1868782349L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityBotCommand extends Api.TypeMessageEntity {
        private final Long constructorId = 1827637959L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityUrl extends Api.TypeMessageEntity {
        private final Long constructorId = 1859134776L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityEmail extends Api.TypeMessageEntity {
        private final Long constructorId = 1692693954L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityBold extends Api.TypeMessageEntity {
        private final Long constructorId = 3177253833L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityItalic extends Api.TypeMessageEntity {
        private final Long constructorId = 2188348256L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityCode extends Api.TypeMessageEntity {
        private final Long constructorId = 681706865L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityPre extends Api.TypeMessageEntity {
        private final Long constructorId = 1938967520L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
        private String language;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityTextUrl extends Api.TypeMessageEntity {
        private final Long constructorId = 1990644519L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityMentionName extends Api.TypeMessageEntity {
        private final Long constructorId = 3699052864L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessageEntityMentionName extends Api.TypeMessageEntity {
        private final Long constructorId = 546203849L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
        private Api.TypeInputUser userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityPhone extends Api.TypeMessageEntity {
        private final Long constructorId = 2607407947L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityCashtag extends Api.TypeMessageEntity {
        private final Long constructorId = 1280209983L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityUnderline extends Api.TypeMessageEntity {
        private final Long constructorId = 2622389899L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityStrike extends Api.TypeMessageEntity {
        private final Long constructorId = 3204879316L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityBlockquote extends Api.TypeMessageEntity {
        private final Long constructorId = 34469328L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntityBankCard extends Api.TypeMessageEntity {
        private final Long constructorId = 1981704948L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageEntitySpoiler extends Api.TypeMessageEntity {
        private final Long constructorId = 852137487L;
        private final long subclassOfId = 3479443932L;
        private final Boolean isFunction = false;

        private int offset;
        private int length;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputChannelEmpty extends Api.TypeInputChannel {
        private final Long constructorId = 4002160262L;
        private final long subclassOfId = 1089602301L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputChannel extends Api.TypeInputChannel {
        private final Long constructorId = 4082822184L;
        private final long subclassOfId = 1089602301L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputChannelFromMessage extends Api.TypeInputChannel {
        private final Long constructorId = 1536380829L;
        private final long subclassOfId = 1089602301L;
        private final Boolean isFunction = false;

        private Api.TypeInputPeer peer;
        private int msgId;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageRange extends Api.TypeMessageRange {
        private final Long constructorId = 182649427L;
        private final long subclassOfId = 3200730487L;
        private final Boolean isFunction = false;

        private int maxId;
        private int minId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelMessagesFilterEmpty extends Api.TypeChannelMessagesFilter {
        private final Long constructorId = 2496933607L;
        private final long subclassOfId = 322136662L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelMessagesFilter extends Api.TypeChannelMessagesFilter {
        private final Long constructorId = 3447183703L;
        private final long subclassOfId = 322136662L;
        private final Boolean isFunction = false;

        private Boolean excludeNewMessages;
        private Api.TypeMessageRange[] ranges;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipant extends Api.TypeChannelParticipant {
        private final Long constructorId = 3222013888L;
        private final long subclassOfId = 3653762072L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantSelf extends Api.TypeChannelParticipant {
        private final Long constructorId = 900251559L;
        private final long subclassOfId = 3653762072L;
        private final Boolean isFunction = false;

        private int date;
        private Boolean viaRequest;
        private BigInteger inviterId;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantCreator extends Api.TypeChannelParticipant {
        private final Long constructorId = 803602899L;
        private final long subclassOfId = 3653762072L;
        private final Boolean isFunction = false;

        private String rank;
        private BigInteger userId;
        private Api.TypeChatAdminRights adminRights;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantAdmin extends Api.TypeChannelParticipant {
        private final Long constructorId = 885242707L;
        private final long subclassOfId = 3653762072L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger inviterId;
        private Boolean canEdit;
        private Boolean self;
        private String rank;
        private BigInteger promotedBy;
        private BigInteger userId;
        private Api.TypeChatAdminRights adminRights;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantBanned extends Api.TypeChannelParticipant {
        private final Long constructorId = 1844969806L;
        private final long subclassOfId = 3653762072L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger kickedBy;
        private Boolean left;
        private Api.TypePeer peer;
        private Api.TypeChatBannedRights bannedRights;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantLeft extends Api.TypeChannelParticipant {
        private final Long constructorId = 453242886L;
        private final long subclassOfId = 3653762072L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantsRecent extends Api.TypeChannelParticipantsFilter {
        private final Long constructorId = 3728686201L;
        private final long subclassOfId = 3209570131L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantsAdmins extends Api.TypeChannelParticipantsFilter {
        private final Long constructorId = 3026225513L;
        private final long subclassOfId = 3209570131L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantsKicked extends Api.TypeChannelParticipantsFilter {
        private final Long constructorId = 2746567045L;
        private final long subclassOfId = 3209570131L;
        private final Boolean isFunction = false;

        private String q;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantsBots extends Api.TypeChannelParticipantsFilter {
        private final Long constructorId = 2966521435L;
        private final long subclassOfId = 3209570131L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantsBanned extends Api.TypeChannelParticipantsFilter {
        private final Long constructorId = 338142689L;
        private final long subclassOfId = 3209570131L;
        private final Boolean isFunction = false;

        private String q;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantsSearch extends Api.TypeChannelParticipantsFilter {
        private final Long constructorId = 106343499L;
        private final long subclassOfId = 3209570131L;
        private final Boolean isFunction = false;

        private String q;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantsContacts extends Api.TypeChannelParticipantsFilter {
        private final Long constructorId = 3144345741L;
        private final long subclassOfId = 3209570131L;
        private final Boolean isFunction = false;

        private String q;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelParticipantsMentions extends Api.TypeChannelParticipantsFilter {
        private final Long constructorId = 3763035371L;
        private final long subclassOfId = 3209570131L;
        private final Boolean isFunction = false;

        private String q;
        private int topMsgId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineMessageMediaAuto extends Api.TypeInputBotInlineMessage {
        private final Long constructorId = 864077702L;
        private final long subclassOfId = 1408974864L;
        private final Boolean isFunction = false;

        private Api.TypeMessageEntity[] entities;
        private Api.TypeReplyMarkup replyMarkup;
        private String message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineMessageText extends Api.TypeInputBotInlineMessage {
        private final Long constructorId = 1036876423L;
        private final long subclassOfId = 1408974864L;
        private final Boolean isFunction = false;

        private Api.TypeMessageEntity[] entities;
        private Api.TypeReplyMarkup replyMarkup;
        private Boolean noWebpage;
        private String message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineMessageMediaGeo extends Api.TypeInputBotInlineMessage {
        private final Long constructorId = 2526190213L;
        private final long subclassOfId = 1408974864L;
        private final Boolean isFunction = false;

        private int period;
        private int heading;
        private Api.TypeReplyMarkup replyMarkup;
        private Api.TypeInputGeoPoint geoPoint;
        private int proximityNotificationRadius;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineMessageMediaVenue extends Api.TypeInputBotInlineMessage {
        private final Long constructorId = 1098628881L;
        private final long subclassOfId = 1408974864L;
        private final Boolean isFunction = false;

        private String address;
        private String venueType;
        private String provider;
        private Api.TypeReplyMarkup replyMarkup;
        private String venueId;
        private Api.TypeInputGeoPoint geoPoint;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineMessageMediaContact extends Api.TypeInputBotInlineMessage {
        private final Long constructorId = 2800599037L;
        private final long subclassOfId = 1408974864L;
        private final Boolean isFunction = false;

        private String firstName;
        private String lastName;
        private String phoneNumber;
        private Api.TypeReplyMarkup replyMarkup;
        private String vcard;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineMessageGame extends Api.TypeInputBotInlineMessage {
        private final Long constructorId = 1262639204L;
        private final long subclassOfId = 1408974864L;
        private final Boolean isFunction = false;

        private Api.TypeReplyMarkup replyMarkup;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineMessageMediaInvoice extends Api.TypeInputBotInlineMessage {
        private final Long constructorId = 3622273573L;
        private final long subclassOfId = 1408974864L;
        private final Boolean isFunction = false;

        private byte payload;
        private String provider;
        private Api.TypeDataJSON providerData;
        private Api.TypeReplyMarkup replyMarkup;
        private String description;
        private Api.TypeInputWebDocument photo;
        private Api.TypeInvoice invoice;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineResult extends Api.TypeInputBotInlineResult {
        private final Long constructorId = 2294256409L;
        private final long subclassOfId = 2158273502L;
        private final Boolean isFunction = false;

        private Api.TypeInputWebDocument thumb;
        private String description;
        private Api.TypeInputBotInlineMessage sendMessage;
        private String id;
        private String type;
        private String title;
        private String url;
        private Api.TypeInputWebDocument content;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineResultPhoto extends Api.TypeInputBotInlineResult {
        private final Long constructorId = 2832753831L;
        private final long subclassOfId = 2158273502L;
        private final Boolean isFunction = false;

        private Api.TypeInputPhoto photo;
        private Api.TypeInputBotInlineMessage sendMessage;
        private String id;
        private String type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineResultDocument extends Api.TypeInputBotInlineResult {
        private final Long constructorId = 4294507972L;
        private final long subclassOfId = 2158273502L;
        private final Boolean isFunction = false;

        private Api.TypeInputDocument document;
        private String description;
        private Api.TypeInputBotInlineMessage sendMessage;
        private String id;
        private String type;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineResultGame extends Api.TypeInputBotInlineResult {
        private final Long constructorId = 1336154098L;
        private final long subclassOfId = 2158273502L;
        private final Boolean isFunction = false;

        private Api.TypeInputBotInlineMessage sendMessage;
        private String id;
        private String shortName;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotInlineMessageMediaAuto extends Api.TypeBotInlineMessage {
        private final Long constructorId = 1984755728L;
        private final long subclassOfId = 3297841032L;
        private final Boolean isFunction = false;

        private Api.TypeMessageEntity[] entities;
        private Api.TypeReplyMarkup replyMarkup;
        private String message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotInlineMessageText extends Api.TypeBotInlineMessage {
        private final Long constructorId = 2357159394L;
        private final long subclassOfId = 3297841032L;
        private final Boolean isFunction = false;

        private Api.TypeMessageEntity[] entities;
        private Api.TypeReplyMarkup replyMarkup;
        private Boolean noWebpage;
        private String message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotInlineMessageMediaGeo extends Api.TypeBotInlineMessage {
        private final Long constructorId = 85477117L;
        private final long subclassOfId = 3297841032L;
        private final Boolean isFunction = false;

        private Api.TypeGeoPoint geo;
        private int period;
        private int heading;
        private Api.TypeReplyMarkup replyMarkup;
        private int proximityNotificationRadius;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotInlineMessageMediaVenue extends Api.TypeBotInlineMessage {
        private final Long constructorId = 2324063644L;
        private final long subclassOfId = 3297841032L;
        private final Boolean isFunction = false;

        private Api.TypeGeoPoint geo;
        private String address;
        private String venueType;
        private String provider;
        private Api.TypeReplyMarkup replyMarkup;
        private String venueId;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotInlineMessageMediaContact extends Api.TypeBotInlineMessage {
        private final Long constructorId = 416402882L;
        private final long subclassOfId = 3297841032L;
        private final Boolean isFunction = false;

        private String firstName;
        private String lastName;
        private String phoneNumber;
        private Api.TypeReplyMarkup replyMarkup;
        private String vcard;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotInlineMessageMediaInvoice extends Api.TypeBotInlineMessage {
        private final Long constructorId = 894081801L;
        private final long subclassOfId = 3297841032L;
        private final Boolean isFunction = false;

        private BigInteger totalAmount;
        private Boolean test;
        private Api.TypeReplyMarkup replyMarkup;
        private Boolean shippingAddressRequested;
        private String description;
        private Api.TypeWebDocument photo;
        private String currency;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotInlineResult extends Api.TypeBotInlineResult {
        private final Long constructorId = 295067450L;
        private final long subclassOfId = 942846933L;
        private final Boolean isFunction = false;

        private Api.TypeWebDocument thumb;
        private String description;
        private Api.TypeBotInlineMessage sendMessage;
        private String id;
        private String type;
        private String title;
        private String url;
        private Api.TypeWebDocument content;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotInlineMediaResult extends Api.TypeBotInlineResult {
        private final Long constructorId = 400266251L;
        private final long subclassOfId = 942846933L;
        private final Boolean isFunction = false;

        private Api.TypeDocument document;
        private Api.TypePhoto photo;
        private String description;
        private Api.TypeBotInlineMessage sendMessage;
        private String id;
        private String type;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ExportedMessageLink extends Api.TypeExportedMessageLink {
        private final Long constructorId = 1571494644L;
        private final long subclassOfId = 3739632844L;
        private final Boolean isFunction = false;

        private String link;
        private String html;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageFwdHeader extends Api.TypeMessageFwdHeader {
        private final Long constructorId = 1601666510L;
        private final long subclassOfId = 2049468420L;
        private final Boolean isFunction = false;

        private int date;
        private Api.TypePeer savedFromPeer;
        private String postAuthor;
        private int channelPost;
        private Boolean imported;
        private String fromName;
        private int savedFromMsgId;
        private Api.TypePeer fromId;
        private String psaType;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineMessageID extends Api.TypeInputBotInlineMessageID {
        private final Long constructorId = 2299280777L;
        private final long subclassOfId = 768434944L;
        private final Boolean isFunction = false;

        private int dcId;
        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputBotInlineMessageID64 extends Api.TypeInputBotInlineMessageID {
        private final Long constructorId = 3067680215L;
        private final long subclassOfId = 768434944L;
        private final Boolean isFunction = false;

        private int dcId;
        private BigInteger accessHash;
        private int id;
        private BigInteger ownerId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InlineBotSwitchPM extends Api.TypeInlineBotSwitchPM {
        private final Long constructorId = 1008755359L;
        private final long subclassOfId = 2192701243L;
        private final Boolean isFunction = false;

        private String startParam;
        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TopPeer extends Api.TypeTopPeer {
        private final Long constructorId = 3989684315L;
        private final long subclassOfId = 1763100161L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
        private double rating;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TopPeerCategoryBotsPM extends Api.TypeTopPeerCategory {
        private final Long constructorId = 2875595611L;
        private final long subclassOfId = 3723502850L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TopPeerCategoryBotsInline extends Api.TypeTopPeerCategory {
        private final Long constructorId = 344356834L;
        private final long subclassOfId = 3723502850L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TopPeerCategoryCorrespondents extends Api.TypeTopPeerCategory {
        private final Long constructorId = 104314861L;
        private final long subclassOfId = 3723502850L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TopPeerCategoryGroups extends Api.TypeTopPeerCategory {
        private final Long constructorId = 3172442442L;
        private final long subclassOfId = 3723502850L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TopPeerCategoryChannels extends Api.TypeTopPeerCategory {
        private final Long constructorId = 371037736L;
        private final long subclassOfId = 3723502850L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TopPeerCategoryPhoneCalls extends Api.TypeTopPeerCategory {
        private final Long constructorId = 511092620L;
        private final long subclassOfId = 3723502850L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TopPeerCategoryForwardUsers extends Api.TypeTopPeerCategory {
        private final Long constructorId = 2822794409L;
        private final long subclassOfId = 3723502850L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TopPeerCategoryForwardChats extends Api.TypeTopPeerCategory {
        private final Long constructorId = 4226728176L;
        private final long subclassOfId = 3723502850L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TopPeerCategoryPeers extends Api.TypeTopPeerCategoryPeers {
        private final Long constructorId = 4219683473L;
        private final long subclassOfId = 78563632L;
        private final Boolean isFunction = false;

        private int count;
        private Api.TypeTopPeer[] peers;
        private Api.TypeTopPeerCategory category;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DraftMessageEmpty extends Api.TypeDraftMessage {
        private final Long constructorId = 453805082L;
        private final long subclassOfId = 869564229L;
        private final Boolean isFunction = false;

        private int date;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DraftMessage extends Api.TypeDraftMessage {
        private final Long constructorId = 4253970719L;
        private final long subclassOfId = 869564229L;
        private final Boolean isFunction = false;

        private int date;
        private Api.TypeMessageEntity[] entities;
        private Boolean noWebpage;
        private int replyToMsgId;
        private String message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StickerSetCovered extends Api.TypeStickerSetCovered {
        private final Long constructorId = 1678812626L;
        private final long subclassOfId = 2139546853L;
        private final Boolean isFunction = false;

        private Api.TypeDocument cover;
        private Api.TypeStickerSet set;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StickerSetMultiCovered extends Api.TypeStickerSetCovered {
        private final Long constructorId = 872932635L;
        private final long subclassOfId = 2139546853L;
        private final Boolean isFunction = false;

        private Api.TypeStickerSet set;
        private Api.TypeDocument[] covers;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MaskCoords extends Api.TypeMaskCoords {
        private final Long constructorId = 2933316530L;
        private final long subclassOfId = 112964349L;
        private final Boolean isFunction = false;

        private double x;
        private double y;
        private double zoom;
        private int n;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputStickeredMediaPhoto extends Api.TypeInputStickeredMedia {
        private final Long constructorId = 1251549527L;
        private final long subclassOfId = 1363597726L;
        private final Boolean isFunction = false;

        private Api.TypeInputPhoto id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputStickeredMediaDocument extends Api.TypeInputStickeredMedia {
        private final Long constructorId = 70813275L;
        private final long subclassOfId = 1363597726L;
        private final Boolean isFunction = false;

        private Api.TypeInputDocument id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Game extends Api.TypeGame {
        private final Long constructorId = 3187238203L;
        private final long subclassOfId = 2199494322L;
        private final Boolean isFunction = false;

        private Api.TypeDocument document;
        private String description;
        private Api.TypePhoto photo;
        private BigInteger accessHash;
        private BigInteger id;
        private String shortName;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputGameID extends Api.TypeInputGame {
        private final Long constructorId = 53231223L;
        private final long subclassOfId = 1221679235L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputGameShortName extends Api.TypeInputGame {
        private final Long constructorId = 3274827786L;
        private final long subclassOfId = 1221679235L;
        private final Boolean isFunction = false;

        private Api.TypeInputUser botId;
        private String shortName;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class HighScore extends Api.TypeHighScore {
        private final Long constructorId = 1940093419L;
        private final long subclassOfId = 3542818357L;
        private final Boolean isFunction = false;

        private int score;
        private int pos;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextEmpty extends Api.TypeRichText {
        private final Long constructorId = 3695018575L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextPlain extends Api.TypeRichText {
        private final Long constructorId = 1950782688L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private String text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextBold extends Api.TypeRichText {
        private final Long constructorId = 1730456516L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextItalic extends Api.TypeRichText {
        private final Long constructorId = 3641877916L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextUnderline extends Api.TypeRichText {
        private final Long constructorId = 3240501956L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextStrike extends Api.TypeRichText {
        private final Long constructorId = 2616769429L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextFixed extends Api.TypeRichText {
        private final Long constructorId = 1816074681L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextUrl extends Api.TypeRichText {
        private final Long constructorId = 1009288385L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private BigInteger webpageId;
        private Api.TypeRichText text;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextEmail extends Api.TypeRichText {
        private final Long constructorId = 3730443734L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
        private String email;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextConcat extends Api.TypeRichText {
        private final Long constructorId = 2120376535L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private Api.TypeRichText[] texts;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextSubscript extends Api.TypeRichText {
        private final Long constructorId = 3983181060L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextSuperscript extends Api.TypeRichText {
        private final Long constructorId = 3355139585L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextMarked extends Api.TypeRichText {
        private final Long constructorId = 55281185L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextPhone extends Api.TypeRichText {
        private final Long constructorId = 483104362L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private String phone;
        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextImage extends Api.TypeRichText {
        private final Long constructorId = 136105807L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private int w;
        private int h;
        private BigInteger documentId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class TextAnchor extends Api.TypeRichText {
        private final Long constructorId = 894777186L;
        private final long subclassOfId = 4056986745L;
        private final Boolean isFunction = false;

        private String name;
        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockUnsupported extends Api.TypePageBlock {
        private final Long constructorId = 324435594L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockTitle extends Api.TypePageBlock {
        private final Long constructorId = 1890305021L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockSubtitle extends Api.TypePageBlock {
        private final Long constructorId = 2415565343L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockAuthorDate extends Api.TypePageBlock {
        private final Long constructorId = 3132089824L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeRichText author;
        private int publishedDate;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockHeader extends Api.TypePageBlock {
        private final Long constructorId = 3218105580L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockSubheader extends Api.TypePageBlock {
        private final Long constructorId = 4046173921L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockParagraph extends Api.TypePageBlock {
        private final Long constructorId = 1182402406L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockPreformatted extends Api.TypePageBlock {
        private final Long constructorId = 3228621118L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private String language;
        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockFooter extends Api.TypePageBlock {
        private final Long constructorId = 1216809369L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockDivider extends Api.TypePageBlock {
        private final Long constructorId = 3676352904L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockAnchor extends Api.TypePageBlock {
        private final Long constructorId = 3456972720L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private String name;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockList extends Api.TypePageBlock {
        private final Long constructorId = 3840442385L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypePageListItem[] items;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockBlockquote extends Api.TypePageBlock {
        private final Long constructorId = 641563686L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeRichText caption;
        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockPullquote extends Api.TypePageBlock {
        private final Long constructorId = 1329878739L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeRichText caption;
        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockPhoto extends Api.TypePageBlock {
        private final Long constructorId = 391759200L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private BigInteger webpageId;
        private BigInteger photoId;
        private Api.TypePageCaption caption;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockVideo extends Api.TypePageBlock {
        private final Long constructorId = 2089805750L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Boolean loop;
        private Api.TypePageCaption caption;
        private BigInteger videoId;
        private Boolean autoplay;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockCover extends Api.TypePageBlock {
        private final Long constructorId = 972174080L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypePageBlock cover;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockEmbed extends Api.TypePageBlock {
        private final Long constructorId = 2826014149L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Boolean fullWidth;
        private Boolean allowScrolling;
        private int w;
        private int h;
        private Api.TypePageCaption caption;
        private String html;
        private String url;
        private BigInteger posterPhotoId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockEmbedPost extends Api.TypePageBlock {
        private final Long constructorId = 4065961995L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger webpageId;
        private String author;
        private Api.TypePageBlock[] blocks;
        private Api.TypePageCaption caption;
        private String url;
        private BigInteger authorPhotoId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockCollage extends Api.TypePageBlock {
        private final Long constructorId = 1705048653L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypePageCaption caption;
        private Api.TypePageBlock[] items;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockSlideshow extends Api.TypePageBlock {
        private final Long constructorId = 52401552L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypePageCaption caption;
        private Api.TypePageBlock[] items;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockChannel extends Api.TypePageBlock {
        private final Long constructorId = 4011282869L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeChat channel;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockAudio extends Api.TypePageBlock {
        private final Long constructorId = 2151899626L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private BigInteger audioId;
        private Api.TypePageCaption caption;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockKicker extends Api.TypePageBlock {
        private final Long constructorId = 504660880L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockTable extends Api.TypePageBlock {
        private final Long constructorId = 3209554562L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Boolean striped;
        private Boolean bordered;
        private Api.TypeRichText title;
        private Api.TypePageTableRow[] rows;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockOrderedList extends Api.TypePageBlock {
        private final Long constructorId = 2592793057L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypePageListOrderedItem[] items;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockDetails extends Api.TypePageBlock {
        private final Long constructorId = 1987480557L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypePageBlock[] blocks;
        private Api.TypeRichText title;
        private Boolean open;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockRelatedArticles extends Api.TypePageBlock {
        private final Long constructorId = 370236054L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeRichText title;
        private Api.TypePageRelatedArticle[] articles;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageBlockMap extends Api.TypePageBlock {
        private final Long constructorId = 2756656886L;
        private final long subclassOfId = 449467972L;
        private final Boolean isFunction = false;

        private Api.TypeGeoPoint geo;
        private int w;
        private int h;
        private Api.TypePageCaption caption;
        private int zoom;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneCallDiscardReasonMissed extends Api.TypePhoneCallDiscardReason {
        private final Long constructorId = 2246320897L;
        private final long subclassOfId = 3634081085L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneCallDiscardReasonDisconnect extends Api.TypePhoneCallDiscardReason {
        private final Long constructorId = 3767910816L;
        private final long subclassOfId = 3634081085L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneCallDiscardReasonHangup extends Api.TypePhoneCallDiscardReason {
        private final Long constructorId = 1471006352L;
        private final long subclassOfId = 3634081085L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneCallDiscardReasonBusy extends Api.TypePhoneCallDiscardReason {
        private final Long constructorId = 4210550985L;
        private final long subclassOfId = 3634081085L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DataJSON extends Api.TypeDataJSON {
        private final Long constructorId = 2104790276L;
        private final long subclassOfId = 2902676200L;
        private final Boolean isFunction = false;

        private String data;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class LabeledPrice extends Api.TypeLabeledPrice {
        private final Long constructorId = 3408489464L;
        private final long subclassOfId = 478413946L;
        private final Boolean isFunction = false;

        private BigInteger amount;
        private String label;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Invoice extends Api.TypeInvoice {
        private final Long constructorId = 1048946971L;
        private final long subclassOfId = 1608003288L;
        private final Boolean isFunction = false;

        private Boolean phoneToProvider;
        private Boolean emailRequested;
        private Boolean test;
        private Boolean recurring;
        private Boolean nameRequested;
        private Boolean shippingAddressRequested;
        private Boolean emailToProvider;
        private BigInteger maxTipAmount;
        private BigInteger[] suggestedTipAmounts;
        private String recurringTermsUrl;
        private Boolean flexible;
        private Boolean phoneRequested;
        private String currency;
        private Api.TypeLabeledPrice[] prices;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PaymentCharge extends Api.TypePaymentCharge {
        private final Long constructorId = 3926049406L;
        private final long subclassOfId = 1019752665L;
        private final Boolean isFunction = false;

        private String id;
        private String providerChargeId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PostAddress extends Api.TypePostAddress {
        private final Long constructorId = 512535275L;
        private final long subclassOfId = 2373900844L;
        private final Boolean isFunction = false;

        private String streetLine2;
        private String streetLine1;
        private String city;
        private String postCode;
        private String state;
        private String countryIso2;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PaymentRequestedInfo extends Api.TypePaymentRequestedInfo {
        private final Long constructorId = 2426158996L;
        private final long subclassOfId = 2377134406L;
        private final Boolean isFunction = false;

        private String phone;
        private String name;
        private Api.TypePostAddress shippingAddress;
        private String email;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PaymentSavedCredentialsCard extends Api.TypePaymentSavedCredentials {
        private final Long constructorId = 3452074527L;
        private final long subclassOfId = 3009576675L;
        private final Boolean isFunction = false;

        private String id;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WebDocument extends Api.TypeWebDocument {
        private final Long constructorId = 475467473L;
        private final long subclassOfId = 996419604L;
        private final Boolean isFunction = false;

        private int size;
        private BigInteger accessHash;
        private Api.TypeDocumentAttribute[] attributes;
        private String mimeType;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WebDocumentNoProxy extends Api.TypeWebDocument {
        private final Long constructorId = 4190682310L;
        private final long subclassOfId = 996419604L;
        private final Boolean isFunction = false;

        private int size;
        private Api.TypeDocumentAttribute[] attributes;
        private String mimeType;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputWebDocument extends Api.TypeInputWebDocument {
        private final Long constructorId = 2616017741L;
        private final long subclassOfId = 2330505542L;
        private final Boolean isFunction = false;

        private int size;
        private Api.TypeDocumentAttribute[] attributes;
        private String mimeType;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputWebFileLocation extends Api.TypeInputWebFileLocation {
        private final Long constructorId = 3258570374L;
        private final long subclassOfId = 4147042521L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputWebFileGeoPointLocation extends Api.TypeInputWebFileLocation {
        private final Long constructorId = 2669814217L;
        private final long subclassOfId = 4147042521L;
        private final Boolean isFunction = false;

        private int w;
        private int h;
        private int scale;
        private BigInteger accessHash;
        private int zoom;
        private Api.TypeInputGeoPoint geoPoint;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPaymentCredentialsSaved extends Api.TypeInputPaymentCredentials {
        private final Long constructorId = 3238965967L;
        private final long subclassOfId = 681157949L;
        private final Boolean isFunction = false;

        private byte tmpPassword;
        private String id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPaymentCredentials extends Api.TypeInputPaymentCredentials {
        private final Long constructorId = 873977640L;
        private final long subclassOfId = 681157949L;
        private final Boolean isFunction = false;

        private Api.TypeDataJSON data;
        private Boolean save;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPaymentCredentialsApplePay extends Api.TypeInputPaymentCredentials {
        private final Long constructorId = 178373535L;
        private final long subclassOfId = 681157949L;
        private final Boolean isFunction = false;

        private Api.TypeDataJSON paymentData;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPaymentCredentialsGooglePay extends Api.TypeInputPaymentCredentials {
        private final Long constructorId = 2328045569L;
        private final long subclassOfId = 681157949L;
        private final Boolean isFunction = false;

        private Api.TypeDataJSON paymentToken;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ShippingOption extends Api.TypeShippingOption {
        private final Long constructorId = 3055631583L;
        private final long subclassOfId = 4108930168L;
        private final Boolean isFunction = false;

        private String id;
        private String title;
        private Api.TypeLabeledPrice[] prices;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputStickerSetItem extends Api.TypeInputStickerSetItem {
        private final Long constructorId = 4288717974L;
        private final long subclassOfId = 2925129845L;
        private final Boolean isFunction = false;

        private Api.TypeMaskCoords maskCoords;
        private String emoji;
        private Api.TypeInputDocument document;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputPhoneCall extends Api.TypeInputPhoneCall {
        private final Long constructorId = 506920429L;
        private final long subclassOfId = 3165319744L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneCallEmpty extends Api.TypePhoneCall {
        private final Long constructorId = 1399245077L;
        private final long subclassOfId = 3296664529L;
        private final Boolean isFunction = false;

        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneCallWaiting extends Api.TypePhoneCall {
        private final Long constructorId = 3307368215L;
        private final long subclassOfId = 3296664529L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger participantId;
        private Api.TypePhoneCallProtocol protocol;
        private BigInteger adminId;
        private int receiveDate;
        private BigInteger accessHash;
        private Boolean video;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneCallRequested extends Api.TypePhoneCall {
        private final Long constructorId = 347139340L;
        private final long subclassOfId = 3296664529L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger participantId;
        private byte gAHash;
        private Api.TypePhoneCallProtocol protocol;
        private BigInteger adminId;
        private BigInteger accessHash;
        private Boolean video;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneCallAccepted extends Api.TypePhoneCall {
        private final Long constructorId = 912311057L;
        private final long subclassOfId = 3296664529L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger participantId;
        private Api.TypePhoneCallProtocol protocol;
        private BigInteger adminId;
        private BigInteger accessHash;
        private Boolean video;
        private BigInteger id;
        private byte gB;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneCall extends Api.TypePhoneCall {
        private final Long constructorId = 2524937319L;
        private final long subclassOfId = 3296664529L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger keyFingerprint;
        private Boolean video;
        private byte gAOrB;
        private BigInteger participantId;
        private Api.TypePhoneCallProtocol protocol;
        private Boolean p2pAllowed;
        private BigInteger adminId;
        private BigInteger accessHash;
        private BigInteger id;
        private Api.TypePhoneConnection[] connections;
        private int startDate;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneCallDiscarded extends Api.TypePhoneCall {
        private final Long constructorId = 1355435489L;
        private final long subclassOfId = 3296664529L;
        private final Boolean isFunction = false;

        private int duration;
        private Api.TypePhoneCallDiscardReason reason;
        private Boolean needDebug;
        private Boolean video;
        private BigInteger id;
        private Boolean needRating;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneConnection extends Api.TypePhoneConnection {
        private final Long constructorId = 2629903303L;
        private final long subclassOfId = 2861425677L;
        private final Boolean isFunction = false;

        private Boolean tcp;
        private int port;
        private String ipv6;
        private String ip;
        private BigInteger id;
        private byte peerTag;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneConnectionWebrtc extends Api.TypePhoneConnection {
        private final Long constructorId = 1667228533L;
        private final long subclassOfId = 2861425677L;
        private final Boolean isFunction = false;

        private String password;
        private int port;
        private String ipv6;
        private String ip;
        private Boolean turn;
        private BigInteger id;
        private Boolean stun;
        private String username;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PhoneCallProtocol extends Api.TypePhoneCallProtocol {
        private final Long constructorId = 4236742600L;
        private final long subclassOfId = 2017038755L;
        private final Boolean isFunction = false;

        private Boolean udpReflector;
        private Boolean udpP2p;
        private int maxLayer;
        private String[] libraryVersions;
        private int minLayer;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class CdnPublicKey extends Api.TypeCdnPublicKey {
        private final Long constructorId = 3380800186L;
        private final long subclassOfId = 383469555L;
        private final Boolean isFunction = false;

        private int dcId;
        private String publicKey;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class CdnConfig extends Api.TypeCdnConfig {
        private final Long constructorId = 1462101002L;
        private final long subclassOfId = 3973724540L;
        private final Boolean isFunction = false;

        private Api.TypeCdnPublicKey[] publicKeys;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class LangPackString extends Api.TypeLangPackString {
        private final Long constructorId = 3402727926L;
        private final long subclassOfId = 3692534457L;
        private final Boolean isFunction = false;

        private String value;
        private String key;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class LangPackStringPluralized extends Api.TypeLangPackString {
        private final Long constructorId = 1816636575L;
        private final long subclassOfId = 3692534457L;
        private final Boolean isFunction = false;

        private String zeroValue;
        private String twoValue;
        private String manyValue;
        private String oneValue;
        private String otherValue;
        private String key;
        private String fewValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class LangPackStringDeleted extends Api.TypeLangPackString {
        private final Long constructorId = 695856818L;
        private final long subclassOfId = 3692534457L;
        private final Boolean isFunction = false;

        private String key;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class LangPackDifference extends Api.TypeLangPackDifference {
        private final Long constructorId = 4085629430L;
        private final long subclassOfId = 1382427989L;
        private final Boolean isFunction = false;

        private int fromVersion;
        private Api.TypeLangPackString[] strings;
        private String langCode;
        private int version;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class LangPackLanguage extends Api.TypeLangPackLanguage {
        private final Long constructorId = 4006239459L;
        private final long subclassOfId = 2880211383L;
        private final Boolean isFunction = false;

        private String nativeName;
        private String baseLangCode;
        private int stringsCount;
        private String langCode;
        private String name;
        private Boolean official;
        private String pluralCode;
        private String translationsUrl;
        private Boolean rtl;
        private Boolean beta;
        private int translatedCount;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionChangeTitle extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 3873421349L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private String newValue;
        private String prevValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionChangeAbout extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1427671598L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private String newValue;
        private String prevValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionChangeUsername extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1783299128L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private String newValue;
        private String prevValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionChangePhoto extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1129042607L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypePhoto newPhoto;
        private Api.TypePhoto prevPhoto;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionToggleInvites extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 460916654L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Boolean newValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionToggleSignatures extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 648939889L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Boolean newValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionUpdatePinned extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 3924306968L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeMessage message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionEditMessage extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1889215493L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeMessage prevMessage;
        private Api.TypeMessage newMessage;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionDeleteMessage extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1121994683L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeMessage message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionParticipantJoin extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 405815507L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionParticipantLeave extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 4170676210L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionParticipantInvite extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 3810276568L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeChannelParticipant participant;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionParticipantToggleBan extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 3872931198L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeChannelParticipant newParticipant;
        private Api.TypeChannelParticipant prevParticipant;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionParticipantToggleAdmin extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 3580323600L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeChannelParticipant newParticipant;
        private Api.TypeChannelParticipant prevParticipant;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionChangeStickerSet extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 2982398631L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeInputStickerSet newStickerset;
        private Api.TypeInputStickerSet prevStickerset;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionTogglePreHistoryHidden extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1599903217L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Boolean newValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionDefaultBannedRights extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 771095562L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeChatBannedRights newBannedRights;
        private Api.TypeChatBannedRights prevBannedRights;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionStopPoll extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 2399639107L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeMessage message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionChangeLinkedChat extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 84703944L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private BigInteger newValue;
        private BigInteger prevValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionChangeLocation extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 241923758L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeChannelLocation newValue;
        private Api.TypeChannelLocation prevValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionToggleSlowMode extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1401984889L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private int newValue;
        private int prevValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionStartGroupCall extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 589338437L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeInputGroupCall call;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionDiscardGroupCall extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 3684667712L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeInputGroupCall call;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionParticipantMute extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 4179895506L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeGroupCallParticipant participant;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionParticipantUnmute extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 3863226816L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeGroupCallParticipant participant;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionToggleGroupCallSetting extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1456906823L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Boolean joinMuted;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionParticipantJoinByInvite extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1557846647L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeExportedChatInvite invite;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionExportedInviteDelete extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1515256996L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeExportedChatInvite invite;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionExportedInviteRevoke extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1091179342L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeExportedChatInvite invite;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionExportedInviteEdit extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 3910056793L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeExportedChatInvite newInvite;
        private Api.TypeExportedChatInvite prevInvite;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionParticipantVolume extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1048537159L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeGroupCallParticipant participant;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionChangeHistoryTTL extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 1855199800L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private int newValue;
        private int prevValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionParticipantJoinByRequest extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 2947945546L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private BigInteger approvedBy;
        private Api.TypeExportedChatInvite invite;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionToggleNoForwards extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 3408578406L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Boolean newValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionSendMessage extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 663693416L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private Api.TypeMessage message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventActionChangeAvailableReactions extends Api.TypeChannelAdminLogEventAction {
        private final Long constructorId = 2633496426L;
        private final long subclassOfId = 2998503411L;
        private final Boolean isFunction = false;

        private String[] newValue;
        private String[] prevValue;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEvent extends Api.TypeChannelAdminLogEvent {
        private final Long constructorId = 531458253L;
        private final long subclassOfId = 1083115929L;
        private final Boolean isFunction = false;

        private int date;
        private Api.TypeChannelAdminLogEventAction action;
        private BigInteger id;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelAdminLogEventsFilter extends Api.TypeChannelAdminLogEventsFilter {
        private final Long constructorId = 3926948580L;
        private final long subclassOfId = 2092692249L;
        private final Boolean isFunction = false;

        private Boolean settings;
        private Boolean pinned;
        private Boolean edit;
        private Boolean delete;
        private Boolean ban;
        private Boolean groupCall;
        private Boolean promote;
        private Boolean unban;
        private Boolean demote;
        private Boolean kick;
        private Boolean leave;
        private Boolean unkick;
        private Boolean invites;
        private Boolean join;
        private Boolean invite;
        private Boolean send;
        private Boolean info;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PopularContact extends Api.TypePopularContact {
        private final Long constructorId = 1558266229L;
        private final long subclassOfId = 67708250L;
        private final Boolean isFunction = false;

        private BigInteger clientId;
        private int importers;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class RecentMeUrlUnknown extends Api.TypeRecentMeUrl {
        private final Long constructorId = 1189204285L;
        private final long subclassOfId = 1436889209L;
        private final Boolean isFunction = false;

        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class RecentMeUrlUser extends Api.TypeRecentMeUrl {
        private final Long constructorId = 3106671074L;
        private final long subclassOfId = 1436889209L;
        private final Boolean isFunction = false;

        private BigInteger userId;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class RecentMeUrlChat extends Api.TypeRecentMeUrl {
        private final Long constructorId = 3000660434L;
        private final long subclassOfId = 1436889209L;
        private final Boolean isFunction = false;

        private BigInteger chatId;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class RecentMeUrlChatInvite extends Api.TypeRecentMeUrl {
        private final Long constructorId = 3947431965L;
        private final long subclassOfId = 1436889209L;
        private final Boolean isFunction = false;

        private String url;
        private Api.TypeChatInvite chatInvite;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class RecentMeUrlStickerSet extends Api.TypeRecentMeUrl {
        private final Long constructorId = 3154794460L;
        private final long subclassOfId = 1436889209L;
        private final Boolean isFunction = false;

        private Api.TypeStickerSetCovered set;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputSingleMedia extends Api.TypeInputSingleMedia {
        private final Long constructorId = 482797855L;
        private final long subclassOfId = 566922968L;
        private final Boolean isFunction = false;

        private BigInteger randomId;
        private Api.TypeMessageEntity[] entities;
        private Api.TypeInputMedia media;
        private String message;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WebAuthorization extends Api.TypeWebAuthorization {
        private final Long constructorId = 2801333330L;
        private final long subclassOfId = 58084656L;
        private final Boolean isFunction = false;

        private int dateCreated;
        private int dateActive;
        private String domain;
        private String browser;
        private String ip;
        private BigInteger botId;
        private String region;
        private BigInteger hash;
        private String platform;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessageID extends Api.TypeInputMessage {
        private final Long constructorId = 2792792866L;
        private final long subclassOfId = 1421262021L;
        private final Boolean isFunction = false;

        private int id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessageReplyTo extends Api.TypeInputMessage {
        private final Long constructorId = 3134751637L;
        private final long subclassOfId = 1421262021L;
        private final Boolean isFunction = false;

        private int id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessagePinned extends Api.TypeInputMessage {
        private final Long constructorId = 2257003832L;
        private final long subclassOfId = 1421262021L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputMessageCallbackQuery extends Api.TypeInputMessage {
        private final Long constructorId = 2902071934L;
        private final long subclassOfId = 1421262021L;
        private final Boolean isFunction = false;

        private int id;
        private BigInteger queryId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputDialogPeer extends Api.TypeInputDialogPeer {
        private final Long constructorId = 4239064759L;
        private final long subclassOfId = 2719782805L;
        private final Boolean isFunction = false;

        private Api.TypeInputPeer peer;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputDialogPeerFolder extends Api.TypeInputDialogPeer {
        private final Long constructorId = 1684014375L;
        private final long subclassOfId = 2719782805L;
        private final Boolean isFunction = false;

        private int folderId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DialogPeer extends Api.TypeDialogPeer {
        private final Long constructorId = 3849174789L;
        private final long subclassOfId = 627892654L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DialogPeerFolder extends Api.TypeDialogPeer {
        private final Long constructorId = 1363483106L;
        private final long subclassOfId = 627892654L;
        private final Boolean isFunction = false;

        private int folderId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class FileHash extends Api.TypeFileHash {
        private final Long constructorId = 4087022428L;
        private final long subclassOfId = 3939776691L;
        private final Boolean isFunction = false;

        private BigInteger offset;
        private int limit;
        private byte hash;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputClientProxy extends Api.TypeInputClientProxy {
        private final Long constructorId = 1968737087L;
        private final long subclassOfId = 152716102L;
        private final Boolean isFunction = false;

        private String address;
        private int port;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputSecureFileUploaded extends Api.TypeInputSecureFile {
        private final Long constructorId = 859091184L;
        private final long subclassOfId = 3670584828L;
        private final Boolean isFunction = false;

        private String md5Checksum;
        private int parts;
        private byte fileHash;
        private BigInteger id;
        private byte secret;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputSecureFile extends Api.TypeInputSecureFile {
        private final Long constructorId = 1399317950L;
        private final long subclassOfId = 3670584828L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureFileEmpty extends Api.TypeSecureFile {
        private final Long constructorId = 1679398724L;
        private final long subclassOfId = 1572395975L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureFile extends Api.TypeSecureFile {
        private final Long constructorId = 2097791614L;
        private final long subclassOfId = 1572395975L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger size;
        private int dcId;
        private byte fileHash;
        private BigInteger accessHash;
        private BigInteger id;
        private byte secret;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureData extends Api.TypeSecureData {
        private final Long constructorId = 2330640067L;
        private final long subclassOfId = 2094276276L;
        private final Boolean isFunction = false;

        private byte data;
        private byte dataHash;
        private byte secret;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecurePlainPhone extends Api.TypeSecurePlainData {
        private final Long constructorId = 2103482845L;
        private final long subclassOfId = 598912950L;
        private final Boolean isFunction = false;

        private String phone;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecurePlainEmail extends Api.TypeSecurePlainData {
        private final Long constructorId = 569137759L;
        private final long subclassOfId = 598912950L;
        private final Boolean isFunction = false;

        private String email;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypePersonalDetails extends Api.TypeSecureValueType {
        private final Long constructorId = 2636808675L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypePassport extends Api.TypeSecureValueType {
        private final Long constructorId = 1034709504L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypeDriverLicense extends Api.TypeSecureValueType {
        private final Long constructorId = 115615172L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypeIdentityCard extends Api.TypeSecureValueType {
        private final Long constructorId = 2698015819L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypeInternalPassport extends Api.TypeSecureValueType {
        private final Long constructorId = 2577698595L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypeAddress extends Api.TypeSecureValueType {
        private final Long constructorId = 3420659238L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypeUtilityBill extends Api.TypeSecureValueType {
        private final Long constructorId = 4231435598L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypeBankStatement extends Api.TypeSecureValueType {
        private final Long constructorId = 2299755533L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypeRentalAgreement extends Api.TypeSecureValueType {
        private final Long constructorId = 2340959368L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypePassportRegistration extends Api.TypeSecureValueType {
        private final Long constructorId = 2581823594L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypeTemporaryRegistration extends Api.TypeSecureValueType {
        private final Long constructorId = 3926060083L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypePhone extends Api.TypeSecureValueType {
        private final Long constructorId = 3005262555L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueTypeEmail extends Api.TypeSecureValueType {
        private final Long constructorId = 2386339822L;
        private final long subclassOfId = 2291398038L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValue extends Api.TypeSecureValue {
        private final Long constructorId = 411017418L;
        private final long subclassOfId = 85014702L;
        private final Boolean isFunction = false;

        private Api.TypeSecurePlainData plainData;
        private Api.TypeSecureData data;
        private Api.TypeSecureFile reverseSide;
        private Api.TypeSecureFile selfie;
        private Api.TypeSecureFile[] translation;
        private Api.TypeSecureFile[] files;
        private Api.TypeSecureValueType type;
        private Api.TypeSecureFile frontSide;
        private byte hash;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputSecureValue extends Api.TypeInputSecureValue {
        private final Long constructorId = 3676426407L;
        private final long subclassOfId = 3030229500L;
        private final Boolean isFunction = false;

        private Api.TypeSecurePlainData plainData;
        private Api.TypeSecureData data;
        private Api.TypeInputSecureFile reverseSide;
        private Api.TypeInputSecureFile selfie;
        private Api.TypeInputSecureFile[] translation;
        private Api.TypeInputSecureFile[] files;
        private Api.TypeSecureValueType type;
        private Api.TypeInputSecureFile frontSide;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueHash extends Api.TypeSecureValueHash {
        private final Long constructorId = 3978218928L;
        private final long subclassOfId = 3589652487L;
        private final Boolean isFunction = false;

        private Api.TypeSecureValueType type;
        private byte hash;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueErrorData extends Api.TypeSecureValueError {
        private final Long constructorId = 3903065049L;
        private final long subclassOfId = 101146574L;
        private final Boolean isFunction = false;

        private String field;
        private byte dataHash;
        private String text;
        private Api.TypeSecureValueType type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueErrorFrontSide extends Api.TypeSecureValueError {
        private final Long constructorId = 12467706L;
        private final long subclassOfId = 101146574L;
        private final Boolean isFunction = false;

        private byte fileHash;
        private String text;
        private Api.TypeSecureValueType type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueErrorReverseSide extends Api.TypeSecureValueError {
        private final Long constructorId = 2257201829L;
        private final long subclassOfId = 101146574L;
        private final Boolean isFunction = false;

        private byte fileHash;
        private String text;
        private Api.TypeSecureValueType type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueErrorSelfie extends Api.TypeSecureValueError {
        private final Long constructorId = 3845639894L;
        private final long subclassOfId = 101146574L;
        private final Boolean isFunction = false;

        private byte fileHash;
        private String text;
        private Api.TypeSecureValueType type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueErrorFile extends Api.TypeSecureValueError {
        private final Long constructorId = 2054162547L;
        private final long subclassOfId = 101146574L;
        private final Boolean isFunction = false;

        private byte fileHash;
        private String text;
        private Api.TypeSecureValueType type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueErrorFiles extends Api.TypeSecureValueError {
        private final Long constructorId = 1717706985L;
        private final long subclassOfId = 101146574L;
        private final Boolean isFunction = false;

        private byte[] fileHash;
        private String text;
        private Api.TypeSecureValueType type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueError extends Api.TypeSecureValueError {
        private final Long constructorId = 2258466191L;
        private final long subclassOfId = 101146574L;
        private final Boolean isFunction = false;

        private String text;
        private Api.TypeSecureValueType type;
        private byte hash;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueErrorTranslationFile extends Api.TypeSecureValueError {
        private final Long constructorId = 2702460784L;
        private final long subclassOfId = 101146574L;
        private final Boolean isFunction = false;

        private byte fileHash;
        private String text;
        private Api.TypeSecureValueType type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureValueErrorTranslationFiles extends Api.TypeSecureValueError {
        private final Long constructorId = 878931416L;
        private final long subclassOfId = 101146574L;
        private final Boolean isFunction = false;

        private byte[] fileHash;
        private String text;
        private Api.TypeSecureValueType type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureCredentialsEncrypted extends Api.TypeSecureCredentialsEncrypted {
        private final Long constructorId = 871426631L;
        private final long subclassOfId = 2497476147L;
        private final Boolean isFunction = false;

        private byte data;
        private byte secret;
        private byte hash;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SavedPhoneContact extends Api.TypeSavedContact {
        private final Long constructorId = 289586518L;
        private final long subclassOfId = 115054788L;
        private final Boolean isFunction = false;

        private int date;
        private String firstName;
        private String lastName;
        private String phone;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PasswordKdfAlgoUnknown extends Api.TypePasswordKdfAlgo {
        private final Long constructorId = 3562713238L;
        private final long subclassOfId = 935130572L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PasswordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow extends Api.TypePasswordKdfAlgo {
        private final Long constructorId = 982592842L;
        private final long subclassOfId = 935130572L;
        private final Boolean isFunction = false;

        private byte p;
        private int g;
        private byte salt1;
        private byte salt2;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecurePasswordKdfAlgoUnknown extends Api.TypeSecurePasswordKdfAlgo {
        private final Long constructorId = 4883767L;
        private final long subclassOfId = 1998989635L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecurePasswordKdfAlgoPBKDF2HMACSHA512iter100000 extends Api.TypeSecurePasswordKdfAlgo {
        private final Long constructorId = 3153255840L;
        private final long subclassOfId = 1998989635L;
        private final Boolean isFunction = false;

        private byte salt;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecurePasswordKdfAlgoSHA512 extends Api.TypeSecurePasswordKdfAlgo {
        private final Long constructorId = 2252807570L;
        private final long subclassOfId = 1998989635L;
        private final Boolean isFunction = false;

        private byte salt;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureSecretSettings extends Api.TypeSecureSecretSettings {
        private final Long constructorId = 354925740L;
        private final long subclassOfId = 3334996731L;
        private final Boolean isFunction = false;

        private byte secureSecret;
        private Api.TypeSecurePasswordKdfAlgo secureAlgo;
        private BigInteger secureSecretId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputCheckPasswordEmpty extends Api.TypeInputCheckPasswordSRP {
        private final Long constructorId = 2558588504L;
        private final long subclassOfId = 3558536544L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputCheckPasswordSRP extends Api.TypeInputCheckPasswordSRP {
        private final Long constructorId = 3531600002L;
        private final long subclassOfId = 3558536544L;
        private final Boolean isFunction = false;

        private byte A;
        private byte M1;
        private BigInteger srpId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureRequiredType extends Api.TypeSecureRequiredType {
        private final Long constructorId = 2191366618L;
        private final long subclassOfId = 2088452618L;
        private final Boolean isFunction = false;

        private Boolean translationRequired;
        private Boolean nativeNames;
        private Boolean selfieRequired;
        private Api.TypeSecureValueType type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SecureRequiredTypeOneOf extends Api.TypeSecureRequiredType {
        private final Long constructorId = 41187252L;
        private final long subclassOfId = 2088452618L;
        private final Boolean isFunction = false;

        private Api.TypeSecureRequiredType[] types;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputAppEvent extends Api.TypeInputAppEvent {
        private final Long constructorId = 488313413L;
        private final long subclassOfId = 2301763846L;
        private final Boolean isFunction = false;

        private Api.TypeJSONValue data;
        private BigInteger peer;
        private double time;
        private String type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class JsonObjectValue extends Api.TypeJSONObjectValue {
        private final Long constructorId = 3235781593L;
        private final long subclassOfId = 2474626745L;
        private final Boolean isFunction = false;

        private Api.TypeJSONValue value;
        private String key;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class JsonNull extends Api.TypeJSONValue {
        private final Long constructorId = 1064139624L;
        private final long subclassOfId = 3952707507L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class JsonBool extends Api.TypeJSONValue {
        private final Long constructorId = 3342098026L;
        private final long subclassOfId = 3952707507L;
        private final Boolean isFunction = false;

        private Boolean value;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class JsonNumber extends Api.TypeJSONValue {
        private final Long constructorId = 736157604L;
        private final long subclassOfId = 3952707507L;
        private final Boolean isFunction = false;

        private double value;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class JsonString extends Api.TypeJSONValue {
        private final Long constructorId = 3072226938L;
        private final long subclassOfId = 3952707507L;
        private final Boolean isFunction = false;

        private String value;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class JsonArray extends Api.TypeJSONValue {
        private final Long constructorId = 4148447075L;
        private final long subclassOfId = 3952707507L;
        private final Boolean isFunction = false;

        private Api.TypeJSONValue[] value;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class JsonObject extends Api.TypeJSONValue {
        private final Long constructorId = 2579616925L;
        private final long subclassOfId = 3952707507L;
        private final Boolean isFunction = false;

        private Api.TypeJSONObjectValue[] value;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageTableCell extends Api.TypePageTableCell {
        private final Long constructorId = 878078826L;
        private final long subclassOfId = 2968203348L;
        private final Boolean isFunction = false;

        private int colspan;
        private int rowspan;
        private Boolean header;
        private Boolean alignCenter;
        private Boolean valignBottom;
        private Api.TypeRichText text;
        private Boolean valignMiddle;
        private Boolean alignRight;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageTableRow extends Api.TypePageTableRow {
        private final Long constructorId = 3770729957L;
        private final long subclassOfId = 1504505361L;
        private final Boolean isFunction = false;

        private Api.TypePageTableCell[] cells;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageCaption extends Api.TypePageCaption {
        private final Long constructorId = 1869903447L;
        private final long subclassOfId = 699985587L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
        private Api.TypeRichText credit;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageListItemText extends Api.TypePageListItem {
        private final Long constructorId = 3106911949L;
        private final long subclassOfId = 2360261809L;
        private final Boolean isFunction = false;

        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageListItemBlocks extends Api.TypePageListItem {
        private final Long constructorId = 635466748L;
        private final long subclassOfId = 2360261809L;
        private final Boolean isFunction = false;

        private Api.TypePageBlock[] blocks;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageListOrderedItemText extends Api.TypePageListOrderedItem {
        private final Long constructorId = 1577484359L;
        private final long subclassOfId = 4007268024L;
        private final Boolean isFunction = false;

        private String num;
        private Api.TypeRichText text;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageListOrderedItemBlocks extends Api.TypePageListOrderedItem {
        private final Long constructorId = 2564655414L;
        private final long subclassOfId = 4007268024L;
        private final Boolean isFunction = false;

        private Api.TypePageBlock[] blocks;
        private String num;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PageRelatedArticle extends Api.TypePageRelatedArticle {
        private final Long constructorId = 3012615176L;
        private final long subclassOfId = 919623714L;
        private final Boolean isFunction = false;

        private BigInteger webpageId;
        private String author;
        private String description;
        private BigInteger photoId;
        private int publishedDate;
        private String title;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Page extends Api.TypePage {
        private final Long constructorId = 2556788493L;
        private final long subclassOfId = 3023575326L;
        private final Boolean isFunction = false;

        private Api.TypeDocument[] documents;
        private Api.TypePageBlock[] blocks;
        private Boolean part;
        private Boolean rtl;
        private Boolean v2;
        private Api.TypePhoto[] photos;
        private String url;
        private int views;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PollAnswer extends Api.TypePollAnswer {
        private final Long constructorId = 1823064809L;
        private final long subclassOfId = 2124799390L;
        private final Boolean isFunction = false;

        private String text;
        private byte option;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Poll extends Api.TypePoll {
        private final Long constructorId = 2262925665L;
        private final long subclassOfId = 613307771L;
        private final Boolean isFunction = false;

        private Boolean quiz;
        private int closeDate;
        private String question;
        private int closePeriod;
        private Boolean publicVoters;
        private Api.TypePollAnswer[] answers;
        private Boolean closed;
        private BigInteger id;
        private Boolean multipleChoice;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PollAnswerVoters extends Api.TypePollAnswerVoters {
        private final Long constructorId = 997055186L;
        private final long subclassOfId = 2095107985L;
        private final Boolean isFunction = false;

        private Boolean correct;
        private int voters;
        private Boolean chosen;
        private byte option;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PollResults extends Api.TypePollResults {
        private final Long constructorId = 3703058083L;
        private final long subclassOfId = 3283416711L;
        private final Boolean isFunction = false;

        private BigInteger[] recentVoters;
        private Boolean min;
        private String solution;
        private Api.TypePollAnswerVoters[] results;
        private Api.TypeMessageEntity[] solutionEntities;
        private int totalVoters;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatOnlines extends Api.TypeChatOnlines {
        private final Long constructorId = 4030849616L;
        private final long subclassOfId = 2357301306L;
        private final Boolean isFunction = false;

        private int onlines;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StatsURL extends Api.TypeStatsURL {
        private final Long constructorId = 1202287072L;
        private final long subclassOfId = 2370606272L;
        private final Boolean isFunction = false;

        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatAdminRights extends Api.TypeChatAdminRights {
        private final Long constructorId = 1605510357L;
        private final long subclassOfId = 2252195780L;
        private final Boolean isFunction = false;

        private Boolean deleteMessages;
        private Boolean manageCall;
        private Boolean banUsers;
        private Boolean other;
        private Boolean pinMessages;
        private Boolean changeInfo;
        private Boolean addAdmins;
        private Boolean anonymous;
        private Boolean editMessages;
        private Boolean postMessages;
        private Boolean inviteUsers;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatBannedRights extends Api.TypeChatBannedRights {
        private final Long constructorId = 2668758040L;
        private final long subclassOfId = 1263814057L;
        private final Boolean isFunction = false;

        private Boolean sendInline;
        private Boolean sendGifs;
        private Boolean sendGames;
        private Boolean pinMessages;
        private Boolean sendStickers;
        private Boolean embedLinks;
        private Boolean inviteUsers;
        private Boolean sendPolls;
        private Boolean sendMedia;
        private Boolean sendMessages;
        private Boolean changeInfo;
        private int untilDate;
        private Boolean viewMessages;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputWallPaper extends Api.TypeInputWallPaper {
        private final Long constructorId = 3861952889L;
        private final long subclassOfId = 4000784410L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputWallPaperSlug extends Api.TypeInputWallPaper {
        private final Long constructorId = 1913199744L;
        private final long subclassOfId = 4000784410L;
        private final Boolean isFunction = false;

        private String slug;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputWallPaperNoFile extends Api.TypeInputWallPaper {
        private final Long constructorId = 2524595758L;
        private final long subclassOfId = 4000784410L;
        private final Boolean isFunction = false;

        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class CodeSettings extends Api.TypeCodeSettings {
        private final Long constructorId = 2321836482L;
        private final long subclassOfId = 1223539850L;
        private final Boolean isFunction = false;

        private byte[] logoutTokens;
        private Boolean allowFlashcall;
        private Boolean allowMissedCall;
        private Boolean allowAppHash;
        private Boolean currentNumber;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WallPaperSettings extends Api.TypeWallPaperSettings {
        private final Long constructorId = 499236004L;
        private final long subclassOfId = 1098244882L;
        private final Boolean isFunction = false;

        private int intensity;
        private int backgroundColor;
        private int thirdBackgroundColor;
        private int fourthBackgroundColor;
        private Boolean motion;
        private int secondBackgroundColor;
        private int rotation;
        private Boolean blur;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AutoDownloadSettings extends Api.TypeAutoDownloadSettings {
        private final Long constructorId = 2398796115L;
        private final long subclassOfId = 1361582535L;
        private final Boolean isFunction = false;

        private BigInteger videoSizeMax;
        private Boolean videoPreloadLarge;
        private Boolean phonecallsLessData;
        private int photoSizeMax;
        private int videoUploadMaxbitrate;
        private Boolean audioPreloadNext;
        private Boolean disabled;
        private BigInteger fileSizeMax;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EmojiKeyword extends Api.TypeEmojiKeyword {
        private final Long constructorId = 3585325561L;
        private final long subclassOfId = 1712497982L;
        private final Boolean isFunction = false;

        private String[] emoticons;
        private String keyword;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EmojiKeywordDeleted extends Api.TypeEmojiKeyword {
        private final Long constructorId = 594408994L;
        private final long subclassOfId = 1712497982L;
        private final Boolean isFunction = false;

        private String[] emoticons;
        private String keyword;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EmojiKeywordsDifference extends Api.TypeEmojiKeywordsDifference {
        private final Long constructorId = 1556570557L;
        private final long subclassOfId = 3531196018L;
        private final Boolean isFunction = false;

        private int fromVersion;
        private Api.TypeEmojiKeyword[] keywords;
        private String langCode;
        private int version;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EmojiURL extends Api.TypeEmojiURL {
        private final Long constructorId = 2775937949L;
        private final long subclassOfId = 530614809L;
        private final Boolean isFunction = false;

        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class EmojiLanguage extends Api.TypeEmojiLanguage {
        private final Long constructorId = 3019592545L;
        private final long subclassOfId = 2760705262L;
        private final Boolean isFunction = false;

        private String langCode;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Folder extends Api.TypeFolder {
        private final Long constructorId = 4283715173L;
        private final long subclassOfId = 3943566587L;
        private final Boolean isFunction = false;

        private Boolean autofillNewBroadcasts;
        private Api.TypeChatPhoto photo;
        private Boolean autofillPublicGroups;
        private int id;
        private String title;
        private Boolean autofillNewCorrespondents;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputFolderPeer extends Api.TypeInputFolderPeer {
        private final Long constructorId = 4224893590L;
        private final long subclassOfId = 1954700800L;
        private final Boolean isFunction = false;

        private Api.TypeInputPeer peer;
        private int folderId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class FolderPeer extends Api.TypeFolderPeer {
        private final Long constructorId = 3921323624L;
        private final long subclassOfId = 4092733499L;
        private final Boolean isFunction = false;

        private Api.TypePeer peer;
        private int folderId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UrlAuthResultRequest extends Api.TypeUrlAuthResult {
        private final Long constructorId = 2463316494L;
        private final long subclassOfId = 2003159838L;
        private final Boolean isFunction = false;

        private Api.TypeUser bot;
        private String domain;
        private Boolean requestWriteAccess;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UrlAuthResultAccepted extends Api.TypeUrlAuthResult {
        private final Long constructorId = 2408320590L;
        private final long subclassOfId = 2003159838L;
        private final Boolean isFunction = false;

        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class UrlAuthResultDefault extends Api.TypeUrlAuthResult {
        private final Long constructorId = 2849430303L;
        private final long subclassOfId = 2003159838L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelLocationEmpty extends Api.TypeChannelLocation {
        private final Long constructorId = 3216354699L;
        private final long subclassOfId = 3961916287L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChannelLocation extends Api.TypeChannelLocation {
        private final Long constructorId = 547062491L;
        private final long subclassOfId = 3961916287L;
        private final Boolean isFunction = false;

        private String address;
        private Api.TypeGeoPoint geoPoint;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PeerLocated extends Api.TypePeerLocated {
        private final Long constructorId = 3393592157L;
        private final long subclassOfId = 4208604332L;
        private final Boolean isFunction = false;

        private int expires;
        private int distance;
        private Api.TypePeer peer;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PeerSelfLocated extends Api.TypePeerLocated {
        private final Long constructorId = 4176226379L;
        private final long subclassOfId = 4208604332L;
        private final Boolean isFunction = false;

        private int expires;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class RestrictionReason extends Api.TypeRestrictionReason {
        private final Long constructorId = 3497176244L;
        private final long subclassOfId = 112039341L;
        private final Boolean isFunction = false;

        private String reason;
        private String text;
        private String platform;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputTheme extends Api.TypeInputTheme {
        private final Long constructorId = 1012306921L;
        private final long subclassOfId = 127992048L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputThemeSlug extends Api.TypeInputTheme {
        private final Long constructorId = 4119399921L;
        private final long subclassOfId = 127992048L;
        private final Boolean isFunction = false;

        private String slug;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Theme extends Api.TypeTheme {
        private final Long constructorId = 2685298646L;
        private final long subclassOfId = 1454688268L;
        private final Boolean isFunction = false;

        private Api.TypeThemeSettings[] settings;
        private Boolean creator;
        private Boolean defaultSuffix;
        private int installsCount;
        private Api.TypeDocument document;
        private BigInteger accessHash;
        private BigInteger id;
        private String title;
        private Boolean forChat;
        private String emoticon;
        private String slug;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BaseThemeClassic extends Api.TypeBaseTheme {
        private final Long constructorId = 3282117730L;
        private final long subclassOfId = 520352836L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BaseThemeDay extends Api.TypeBaseTheme {
        private final Long constructorId = 4225242760L;
        private final long subclassOfId = 520352836L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BaseThemeNight extends Api.TypeBaseTheme {
        private final Long constructorId = 3081969320L;
        private final long subclassOfId = 520352836L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BaseThemeTinted extends Api.TypeBaseTheme {
        private final Long constructorId = 1834973166L;
        private final long subclassOfId = 520352836L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BaseThemeArctic extends Api.TypeBaseTheme {
        private final Long constructorId = 1527845466L;
        private final long subclassOfId = 520352836L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputThemeSettings extends Api.TypeInputThemeSettings {
        private final Long constructorId = 2413711439L;
        private final long subclassOfId = 2201536642L;
        private final Boolean isFunction = false;

        private Boolean messageColorsAnimated;
        private Api.TypeBaseTheme baseTheme;
        private Api.TypeInputWallPaper wallpaper;
        private int accentColor;
        private Api.TypeWallPaperSettings wallpaperSettings;
        private int[] messageColors;
        private int outboxAccentColor;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ThemeSettings extends Api.TypeThemeSettings {
        private final Long constructorId = 4200117972L;
        private final long subclassOfId = 2187750712L;
        private final Boolean isFunction = false;

        private Boolean messageColorsAnimated;
        private Api.TypeBaseTheme baseTheme;
        private Api.TypeWallPaper wallpaper;
        private int accentColor;
        private int[] messageColors;
        private int outboxAccentColor;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WebPageAttributeTheme extends Api.TypeWebPageAttribute {
        private final Long constructorId = 1421174295L;
        private final long subclassOfId = 2949638599L;
        private final Boolean isFunction = false;

        private Api.TypeThemeSettings settings;
        private Api.TypeDocument[] documents;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageUserVote extends Api.TypeMessageUserVote {
        private final Long constructorId = 886196148L;
        private final long subclassOfId = 3375158674L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger userId;
        private byte option;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageUserVoteInputOption extends Api.TypeMessageUserVote {
        private final Long constructorId = 1017491692L;
        private final long subclassOfId = 3375158674L;
        private final Boolean isFunction = false;

        private int date;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageUserVoteMultiple extends Api.TypeMessageUserVote {
        private final Long constructorId = 2321933655L;
        private final long subclassOfId = 3375158674L;
        private final Boolean isFunction = false;

        private int date;
        private byte[] options;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BankCardOpenUrl extends Api.TypeBankCardOpenUrl {
        private final Long constructorId = 4117234314L;
        private final long subclassOfId = 4074915342L;
        private final Boolean isFunction = false;

        private String name;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DialogFilter extends Api.TypeDialogFilter {
        private final Long constructorId = 1949890536L;
        private final long subclassOfId = 1764475991L;
        private final Boolean isFunction = false;

        private Boolean excludeRead;
        private Boolean bots;
        private Boolean excludeMuted;
        private Boolean groups;
        private Boolean broadcasts;
        private Boolean nonContacts;
        private String title;
        private Api.TypeInputPeer[] excludePeers;
        private Api.TypeInputPeer[] includePeers;
        private Boolean excludeArchived;
        private int id;
        private String emoticon;
        private Boolean contacts;
        private Api.TypeInputPeer[] pinnedPeers;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DialogFilterDefault extends Api.TypeDialogFilter {
        private final Long constructorId = 909284270L;
        private final long subclassOfId = 1764475991L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DialogFilterSuggested extends Api.TypeDialogFilterSuggested {
        private final Long constructorId = 2004110666L;
        private final long subclassOfId = 837673094L;
        private final Boolean isFunction = false;

        private Api.TypeDialogFilter filter;
        private String description;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StatsDateRangeDays extends Api.TypeStatsDateRangeDays {
        private final Long constructorId = 3057118639L;
        private final long subclassOfId = 2166579781L;
        private final Boolean isFunction = false;

        private int minDate;
        private int maxDate;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StatsAbsValueAndPrev extends Api.TypeStatsAbsValueAndPrev {
        private final Long constructorId = 3410210014L;
        private final long subclassOfId = 1052662191L;
        private final Boolean isFunction = false;

        private double current;
        private double previous;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StatsPercentValue extends Api.TypeStatsPercentValue {
        private final Long constructorId = 3419287520L;
        private final long subclassOfId = 2533541150L;
        private final Boolean isFunction = false;

        private double total;
        private double part;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StatsGraphAsync extends Api.TypeStatsGraph {
        private final Long constructorId = 1244130093L;
        private final long subclassOfId = 2609918291L;
        private final Boolean isFunction = false;

        private String token;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StatsGraphError extends Api.TypeStatsGraph {
        private final Long constructorId = 3202127906L;
        private final long subclassOfId = 2609918291L;
        private final Boolean isFunction = false;

        private String error;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StatsGraph extends Api.TypeStatsGraph {
        private final Long constructorId = 2393138358L;
        private final long subclassOfId = 2609918291L;
        private final Boolean isFunction = false;

        private String zoomToken;
        private Api.TypeDataJSON json;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageInteractionCounters extends Api.TypeMessageInteractionCounters {
        private final Long constructorId = 2907687357L;
        private final long subclassOfId = 641251104L;
        private final Boolean isFunction = false;

        private int forwards;
        private int msgId;
        private int views;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class VideoSize extends Api.TypeVideoSize {
        private final Long constructorId = 3727929492L;
        private final long subclassOfId = 1660015881L;
        private final Boolean isFunction = false;

        private double videoStartTs;
        private int size;
        private int w;
        private int h;
        private String type;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StatsGroupTopPoster extends Api.TypeStatsGroupTopPoster {
        private final Long constructorId = 2634330011L;
        private final long subclassOfId = 2177224227L;
        private final Boolean isFunction = false;

        private int messages;
        private BigInteger userId;
        private int avgChars;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StatsGroupTopAdmin extends Api.TypeStatsGroupTopAdmin {
        private final Long constructorId = 3612888199L;
        private final long subclassOfId = 2150997085L;
        private final Boolean isFunction = false;

        private int deleted;
        private int kicked;
        private int banned;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class StatsGroupTopInviter extends Api.TypeStatsGroupTopInviter {
        private final Long constructorId = 1398765469L;
        private final long subclassOfId = 2231438458L;
        private final Boolean isFunction = false;

        private int invitations;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class GlobalPrivacySettings extends Api.TypeGlobalPrivacySettings {
        private final Long constructorId = 3198350372L;
        private final long subclassOfId = 3373160304L;
        private final Boolean isFunction = false;

        private Boolean archiveAndMuteNewNoncontactPeers;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageViews extends Api.TypeMessageViews {
        private final Long constructorId = 1163625789L;
        private final long subclassOfId = 1018201017L;
        private final Boolean isFunction = false;

        private int forwards;
        private Api.TypeMessageReplies replies;
        private int views;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageReplyHeader extends Api.TypeMessageReplyHeader {
        private final Long constructorId = 2799007587L;
        private final long subclassOfId = 1531810151L;
        private final Boolean isFunction = false;

        private Boolean replyToScheduled;
        private int replyToTopId;
        private Api.TypePeer replyToPeerId;
        private int replyToMsgId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageReplies extends Api.TypeMessageReplies {
        private final Long constructorId = 2211844034L;
        private final long subclassOfId = 1825397986L;
        private final Boolean isFunction = false;

        private int maxId;
        private Boolean comments;
        private int replies;
        private int readMaxId;
        private Api.TypePeer[] recentRepliers;
        private int repliesPts;
        private BigInteger channelId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PeerBlocked extends Api.TypePeerBlocked {
        private final Long constructorId = 3908927508L;
        private final long subclassOfId = 1425210520L;
        private final Boolean isFunction = false;

        private Api.TypePeer peerId;
        private int date;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class GroupCallDiscarded extends Api.TypeGroupCall {
        private final Long constructorId = 2004925620L;
        private final long subclassOfId = 548729632L;
        private final Boolean isFunction = false;

        private int duration;
        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class GroupCall extends Api.TypeGroupCall {
        private final Long constructorId = 3583468812L;
        private final long subclassOfId = 548729632L;
        private final Boolean isFunction = false;

        private Boolean canStartVideo;
        private int participantsCount;
        private int unmutedVideoLimit;
        private Boolean joinDateAsc;
        private Boolean scheduleStartSubscribed;
        private String title;
        private int version;
        private Boolean joinMuted;
        private Boolean rtmpStream;
        private int recordStartDate;
        private Boolean recordVideoActive;
        private Boolean canChangeJoinMuted;
        private int scheduleDate;
        private BigInteger accessHash;
        private Boolean listenersHidden;
        private BigInteger id;
        private int streamDcId;
        private int unmutedVideoCount;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputGroupCall extends Api.TypeInputGroupCall {
        private final Long constructorId = 3635053583L;
        private final long subclassOfId = 1482758833L;
        private final Boolean isFunction = false;

        private BigInteger accessHash;
        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class GroupCallParticipant extends Api.TypeGroupCallParticipant {
        private final Long constructorId = 3953538814L;
        private final long subclassOfId = 3222974284L;
        private final Boolean isFunction = false;

        private int date;
        private Boolean videoJoined;
        private Boolean justJoined;
        private String about;
        private int source;
        private Api.TypeGroupCallParticipantVideo video;
        private int volume;
        private Api.TypeGroupCallParticipantVideo presentation;
        private Boolean min;
        private Boolean volumeByAdmin;
        private Boolean left;
        private Boolean mutedByYou;
        private Boolean versioned;
        private Api.TypePeer peer;
        private int activeDate;
        private Boolean canSelfUnmute;
        private Boolean self;
        private Boolean muted;
        private BigInteger raiseHandRating;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InlineQueryPeerTypeSameBotPM extends Api.TypeInlineQueryPeerType {
        private final Long constructorId = 813821341L;
        private final long subclassOfId = 2947611167L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InlineQueryPeerTypePM extends Api.TypeInlineQueryPeerType {
        private final Long constructorId = 2201751468L;
        private final long subclassOfId = 2947611167L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InlineQueryPeerTypeChat extends Api.TypeInlineQueryPeerType {
        private final Long constructorId = 3613836554L;
        private final long subclassOfId = 2947611167L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InlineQueryPeerTypeMegagroup extends Api.TypeInlineQueryPeerType {
        private final Long constructorId = 1589952067L;
        private final long subclassOfId = 2947611167L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InlineQueryPeerTypeBroadcast extends Api.TypeInlineQueryPeerType {
        private final Long constructorId = 1664413338L;
        private final long subclassOfId = 2947611167L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatInviteImporter extends Api.TypeChatInviteImporter {
        private final Long constructorId = 2354765785L;
        private final long subclassOfId = 1393710126L;
        private final Boolean isFunction = false;

        private int date;
        private Boolean requested;
        private String about;
        private BigInteger approvedBy;
        private BigInteger userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ChatAdminWithInvites extends Api.TypeChatAdminWithInvites {
        private final Long constructorId = 4075613987L;
        private final long subclassOfId = 1348727704L;
        private final Boolean isFunction = false;

        private int revokedInvitesCount;
        private BigInteger adminId;
        private int invitesCount;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class GroupCallParticipantVideoSourceGroup extends Api.TypeGroupCallParticipantVideoSourceGroup {
        private final Long constructorId = 3702593719L;
        private final long subclassOfId = 806746236L;
        private final Boolean isFunction = false;

        private int[] sources;
        private String semantics;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class GroupCallParticipantVideo extends Api.TypeGroupCallParticipantVideo {
        private final Long constructorId = 1735736008L;
        private final long subclassOfId = 4014389467L;
        private final Boolean isFunction = false;

        private Boolean paused;
        private String endpoint;
        private Api.TypeGroupCallParticipantVideoSourceGroup[] sourceGroups;
        private int audioSource;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotCommandScopeDefault extends Api.TypeBotCommandScope {
        private final Long constructorId = 795652779L;
        private final long subclassOfId = 1269783824L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotCommandScopeUsers extends Api.TypeBotCommandScope {
        private final Long constructorId = 1011811544L;
        private final long subclassOfId = 1269783824L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotCommandScopeChats extends Api.TypeBotCommandScope {
        private final Long constructorId = 1877059713L;
        private final long subclassOfId = 1269783824L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotCommandScopeChatAdmins extends Api.TypeBotCommandScope {
        private final Long constructorId = 3114950762L;
        private final long subclassOfId = 1269783824L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotCommandScopePeer extends Api.TypeBotCommandScope {
        private final Long constructorId = 3684534653L;
        private final long subclassOfId = 1269783824L;
        private final Boolean isFunction = false;

        private Api.TypeInputPeer peer;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotCommandScopePeerAdmins extends Api.TypeBotCommandScope {
        private final Long constructorId = 1071145937L;
        private final long subclassOfId = 1269783824L;
        private final Boolean isFunction = false;

        private Api.TypeInputPeer peer;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotCommandScopePeerUser extends Api.TypeBotCommandScope {
        private final Long constructorId = 169026035L;
        private final long subclassOfId = 1269783824L;
        private final Boolean isFunction = false;

        private Api.TypeInputPeer peer;
        private Api.TypeInputUser userId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SponsoredMessage extends Api.TypeSponsoredMessage {
        private final Long constructorId = 981691896L;
        private final long subclassOfId = 3780630582L;
        private final Boolean isFunction = false;

        private byte randomId;
        private String startParam;
        private Api.TypeMessageEntity[] entities;
        private int channelPost;
        private String chatInviteHash;
        private String message;
        private Api.TypePeer fromId;
        private Api.TypeChatInvite chatInvite;
        private Boolean recommended;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SearchResultsCalendarPeriod extends Api.TypeSearchResultsCalendarPeriod {
        private final Long constructorId = 3383776159L;
        private final long subclassOfId = 3797743871L;
        private final Boolean isFunction = false;

        private int date;
        private int count;
        private int minMsgId;
        private int maxMsgId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SearchResultPosition extends Api.TypeSearchResultsPosition {
        private final Long constructorId = 2137295719L;
        private final long subclassOfId = 3101824532L;
        private final Boolean isFunction = false;

        private int date;
        private int offset;
        private int msgId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ReactionCount extends Api.TypeReactionCount {
        private final Long constructorId = 1873957073L;
        private final long subclassOfId = 3523792447L;
        private final Boolean isFunction = false;

        private String reaction;
        private int count;
        private Boolean chosen;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessageReactions extends Api.TypeMessageReactions {
        private final Long constructorId = 1328256121L;
        private final long subclassOfId = 2321221404L;
        private final Boolean isFunction = false;

        private Boolean min;
        private Boolean canSeeList;
        private Api.TypeMessagePeerReaction[] recentReactions;
        private Api.TypeReactionCount[] results;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AvailableReaction extends Api.TypeAvailableReaction {
        private final Long constructorId = 3229084673L;
        private final long subclassOfId = 2350685555L;
        private final Boolean isFunction = false;

        private Api.TypeDocument staticIcon;
        private Api.TypeDocument appearAnimation;
        private Boolean inactive;
        private Boolean premium;
        private String reaction;
        private Api.TypeDocument centerIcon;
        private Api.TypeDocument activateAnimation;
        private Api.TypeDocument selectAnimation;
        private String title;
        private Api.TypeDocument effectAnimation;
        private Api.TypeDocument aroundAnimation;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class MessagePeerReaction extends Api.TypeMessagePeerReaction {
        private final Long constructorId = 1370914559L;
        private final long subclassOfId = 2943591077L;
        private final Boolean isFunction = false;

        private Api.TypePeer peerId;
        private Boolean big;
        private String reaction;
        private Boolean unread;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class GroupCallStreamChannel extends Api.TypeGroupCallStreamChannel {
        private final Long constructorId = 2162903215L;
        private final long subclassOfId = 3712266840L;
        private final Boolean isFunction = false;

        private BigInteger lastTimestampMs;
        private int channel;
        private int scale;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AttachMenuBotIconColor extends Api.TypeAttachMenuBotIconColor {
        private final Long constructorId = 1165423600L;
        private final long subclassOfId = 3198471018L;
        private final Boolean isFunction = false;

        private int color;
        private String name;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AttachMenuBotIcon extends Api.TypeAttachMenuBotIcon {
        private final Long constructorId = 2997303403L;
        private final long subclassOfId = 2152219989L;
        private final Boolean isFunction = false;

        private String name;
        private Api.TypeDocument icon;
        private Api.TypeAttachMenuBotIconColor[] colors;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AttachMenuBot extends Api.TypeAttachMenuBot {
        private final Long constructorId = 3366595794L;
        private final long subclassOfId = 2668131398L;
        private final Boolean isFunction = false;

        private Boolean inactive;
        private Boolean hasSettings;
        private Api.TypeAttachMenuPeerType[] peerTypes;
        private BigInteger botId;
        private String shortName;
        private Api.TypeAttachMenuBotIcon[] icons;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AttachMenuBotsNotModified extends Api.TypeAttachMenuBots {
        private final Long constructorId = 4057500252L;
        private final long subclassOfId = 2217616346L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AttachMenuBots extends Api.TypeAttachMenuBots {
        private final Long constructorId = 1011024320L;
        private final long subclassOfId = 2217616346L;
        private final Boolean isFunction = false;

        private Api.TypeAttachMenuBot[] bots;
        private BigInteger hash;
        private Api.TypeUser[] users;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AttachMenuBotsBot extends Api.TypeAttachMenuBotsBot {
        private final Long constructorId = 2478794367L;
        private final long subclassOfId = 3677587517L;
        private final Boolean isFunction = false;

        private Api.TypeAttachMenuBot bot;
        private Api.TypeUser[] users;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WebViewResultUrl extends Api.TypeWebViewResult {
        private final Long constructorId = 202659196L;
        private final long subclassOfId = 2479793990L;
        private final Boolean isFunction = false;

        private String url;
        private BigInteger queryId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SimpleWebViewResultUrl extends Api.TypeSimpleWebViewResult {
        private final Long constructorId = 2284811963L;
        private final long subclassOfId = 367977435L;
        private final Boolean isFunction = false;

        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class WebViewMessageSent extends Api.TypeWebViewMessageSent {
        private final Long constructorId = 211046684L;
        private final long subclassOfId = 1977914130L;
        private final Boolean isFunction = false;

        private Api.TypeInputBotInlineMessageID msgId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotMenuButtonDefault extends Api.TypeBotMenuButton {
        private final Long constructorId = 1966318984L;
        private final long subclassOfId = 1282522428L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotMenuButtonCommands extends Api.TypeBotMenuButton {
        private final Long constructorId = 1113113093L;
        private final long subclassOfId = 1282522428L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class BotMenuButton extends Api.TypeBotMenuButton {
        private final Long constructorId = 3350559974L;
        private final long subclassOfId = 1282522428L;
        private final Boolean isFunction = false;

        private String text;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class NotificationSoundDefault extends Api.TypeNotificationSound {
        private final Long constructorId = 2548612798L;
        private final long subclassOfId = 4076201307L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class NotificationSoundNone extends Api.TypeNotificationSound {
        private final Long constructorId = 1863070943L;
        private final long subclassOfId = 4076201307L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class NotificationSoundLocal extends Api.TypeNotificationSound {
        private final Long constructorId = 2198575844L;
        private final long subclassOfId = 4076201307L;
        private final Boolean isFunction = false;

        private String data;
        private String title;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class NotificationSoundRingtone extends Api.TypeNotificationSound {
        private final Long constructorId = 4285300809L;
        private final long subclassOfId = 4076201307L;
        private final Boolean isFunction = false;

        private BigInteger id;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AttachMenuPeerTypeSameBotPM extends Api.TypeAttachMenuPeerType {
        private final Long constructorId = 2104224014L;
        private final long subclassOfId = 3520628432L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AttachMenuPeerTypeBotPM extends Api.TypeAttachMenuPeerType {
        private final Long constructorId = 3274439194L;
        private final long subclassOfId = 3520628432L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AttachMenuPeerTypePM extends Api.TypeAttachMenuPeerType {
        private final Long constructorId = 4047950623L;
        private final long subclassOfId = 3520628432L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AttachMenuPeerTypeChat extends Api.TypeAttachMenuPeerType {
        private final Long constructorId = 84480319L;
        private final long subclassOfId = 3520628432L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class AttachMenuPeerTypeBroadcast extends Api.TypeAttachMenuPeerType {
        private final Long constructorId = 2080104188L;
        private final long subclassOfId = 3520628432L;
        private final Boolean isFunction = false;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputInvoiceMessage extends Api.TypeInputInvoice {
        private final Long constructorId = 3317000281L;
        private final long subclassOfId = 1919851518L;
        private final Boolean isFunction = false;

        private Api.TypeInputPeer peer;
        private int msgId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class InputInvoiceSlug extends Api.TypeInputInvoice {
        private final Long constructorId = 3274099439L;
        private final long subclassOfId = 1919851518L;
        private final Boolean isFunction = false;

        private String slug;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ReqPq extends Api.TypeResPQ {
        private final Long constructorId = 1615239032L;
        private final long subclassOfId = 2020181688L;
        private final Boolean isFunction = true;

        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ReqPqMulti extends Api.TypeResPQ {
        private final Long constructorId = 3195965169L;
        private final long subclassOfId = 2020181688L;
        private final Boolean isFunction = true;

        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ReqPqMultiNew extends Api.TypeResPQ {
        private final Long constructorId = 1370755325L;
        private final long subclassOfId = 2020181688L;
        private final Boolean isFunction = true;

        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class ReqDHParams extends Api.TypeServer_DH_Params {
        private final Long constructorId = 3608339646L;
        private final long subclassOfId = 2786626974L;
        private final Boolean isFunction = true;

        private byte p;
        private byte q;
        private BigInteger publicKeyFingerprint;
        private byte encryptedData;
        private BigInteger serverNonce;
        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class SetClientDHParams extends Api.TypeSet_client_DH_params_answer {
        private final Long constructorId = 4110704415L;
        private final long subclassOfId = 1440574683L;
        private final Boolean isFunction = true;

        private byte encryptedData;
        private BigInteger serverNonce;
        private BigInteger nonce;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DestroyAuthKey extends Api.TypeDestroyAuthKeyRes {
        private final Long constructorId = 3510849888L;
        private final long subclassOfId = 2190599822L;
        private final Boolean isFunction = true;

    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class RpcDropAnswer extends Api.TypeRpcDropAnswer {
        private final Long constructorId = 1491380032L;
        private final long subclassOfId = 1271559536L;
        private final Boolean isFunction = true;

        private BigInteger reqMsgId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class GetFutureSalts extends Api.TypeFutureSalts {
        private final Long constructorId = 3105996036L;
        private final long subclassOfId = 277935383L;
        private final Boolean isFunction = true;

        private int num;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Ping extends Api.TypePong {
        private final Long constructorId = 2059302892L;
        private final long subclassOfId = 2171268721L;
        private final Boolean isFunction = true;

        private BigInteger pingId;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class PingDelayDisconnect extends Api.TypePong {
        private final Long constructorId = 4081220492L;
        private final long subclassOfId = 2171268721L;
        private final Boolean isFunction = true;

        private BigInteger pingId;
        private int disconnectDelay;
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class DestroySession extends Api.TypeDestroySessionRes {
        private final Long constructorId = 3880853798L;
        private final long subclassOfId = 2936858557L;
        private final Boolean isFunction = true;

        private BigInteger sessionId;
    }

    @Data
    public static class InvokeAfterMsg {
        private final Long constructorId = 3416209197L;
        private final long subclassOfId = 3081909835L;
        private final Boolean isFunction = true;

        private Api.X query;
        private BigInteger msgId;
    }

    @Data
    public static class InvokeAfterMsgs {
        private final Long constructorId = 1036301552L;
        private final long subclassOfId = 3081909835L;
        private final Boolean isFunction = true;

        private BigInteger[] msgIds;
        private Api.X query;
    }

    @Data
    public static class InitConnection {
        private final Long constructorId = 3251461801L;
        private final long subclassOfId = 3081909835L;
        private final Boolean isFunction = true;

        private Api.TypeInputClientProxy proxy;
        private String appVersion;
        private String langPack;
        private String langCode;
        private Api.X query;
        private String deviceModel;
        private String systemLangCode;
        private Api.TypeJSONValue params;
        private String systemVersion;
        private int apiId;
    }

    @Data
    public static class InvokeWithLayer {
        private final Long constructorId = 3667594509L;
        private final long subclassOfId = 3081909835L;
        private final Boolean isFunction = true;

        private Api.X query;
        private int layer;
    }

    @Data
    public static class InvokeWithoutUpdates {
        private final Long constructorId = 3214170551L;
        private final long subclassOfId = 3081909835L;
        private final Boolean isFunction = true;

        private Api.X query;
    }

    @Data
    public static class InvokeWithMessagesRange {
        private final Long constructorId = 911373810L;
        private final long subclassOfId = 3081909835L;
        private final Boolean isFunction = true;

        private Api.X query;
        private Api.TypeMessageRange range;
    }

    @Data
    public static class InvokeWithTakeout {
        private final Long constructorId = 2896821550L;
        private final long subclassOfId = 3081909835L;
        private final Boolean isFunction = true;

        private Api.X query;
        private BigInteger takeoutId;
    }
}
