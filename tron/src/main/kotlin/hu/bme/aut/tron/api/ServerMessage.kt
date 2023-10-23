package hu.bme.aut.tron.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
abstract class ServerMessage

@Serializable
@SerialName("bad")
data class BadMessage(val msg: String) : ServerMessage()

@Serializable
@SerialName("map")
data class MapMessage(val map: List<List<Byte>>) : ServerMessage()

@Serializable
@SerialName("settingsChanged")
data class SettingsChangedMessage(val settings: Settings) : ServerMessage()

@Serializable
@SerialName("full")
data class LobbyFullMessage(val name: String) : ServerMessage()

@Serializable
@SerialName("players")
data class PlayersMessage(val players: List<ApiPlayer>) : ServerMessage()

@Serializable
@SerialName("countDown")
data class CountDownMessage(val sec: Int) : ServerMessage()

@Serializable
@SerialName("start")
data class StartMessage(val msg: String? = null) : ServerMessage()
