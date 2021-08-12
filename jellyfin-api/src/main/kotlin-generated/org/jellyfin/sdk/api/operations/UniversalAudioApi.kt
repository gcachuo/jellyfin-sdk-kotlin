// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import io.ktor.utils.io.ByteReadChannel
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.emptyList
import kotlin.collections.mutableMapOf
import org.jellyfin.sdk.api.client.KtorClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.model.UUID

public class UniversalAudioApi(
	private val api: KtorClient
) {
	/**
	 * Gets an audio stream.
	 *
	 * @param itemId The item id.
	 * @param container Optional. The audio container.
	 * @param mediaSourceId The media version id, if playing an alternate version.
	 * @param deviceId The device id of the client requesting. Used to stop encoding processes when
	 * needed.
	 * @param userId Optional. The user id.
	 * @param audioCodec Optional. The audio codec to transcode to.
	 * @param maxAudioChannels Optional. The maximum number of audio channels.
	 * @param transcodingAudioChannels Optional. The number of how many audio channels to transcode to.
	 * @param maxStreamingBitrate Optional. The maximum streaming bitrate.
	 * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted
	 * this will be left to encoder defaults.
	 * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1 tick = 10000 ms.
	 * @param transcodingContainer Optional. The container to transcode to.
	 * @param transcodingProtocol Optional. The transcoding protocol.
	 * @param maxAudioSampleRate Optional. The maximum audio sample rate.
	 * @param maxAudioBitDepth Optional. The maximum audio bit depth.
	 * @param enableRemoteMedia Optional. Whether to enable remote media.
	 * @param breakOnNonKeyFrames Optional. Whether to break on non key frames.
	 * @param enableRedirection Whether to enable redirection. Defaults to true.
	 */
	public suspend fun getUniversalAudioStream(
		itemId: UUID,
		container: Collection<String>? = emptyList(),
		mediaSourceId: String? = null,
		deviceId: String? = null,
		userId: UUID? = null,
		audioCodec: String? = null,
		maxAudioChannels: Int? = null,
		transcodingAudioChannels: Int? = null,
		maxStreamingBitrate: Int? = null,
		audioBitRate: Int? = null,
		startTimeTicks: Long? = null,
		transcodingContainer: String? = null,
		transcodingProtocol: String? = null,
		maxAudioSampleRate: Int? = null,
		maxAudioBitDepth: Int? = null,
		enableRemoteMedia: Boolean? = null,
		breakOnNonKeyFrames: Boolean? = false,
		enableRedirection: Boolean? = true
	): Response<ByteReadChannel> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["container"] = container
		queryParameters["mediaSourceId"] = mediaSourceId
		queryParameters["deviceId"] = deviceId
		queryParameters["userId"] = userId
		queryParameters["audioCodec"] = audioCodec
		queryParameters["maxAudioChannels"] = maxAudioChannels
		queryParameters["transcodingAudioChannels"] = transcodingAudioChannels
		queryParameters["maxStreamingBitrate"] = maxStreamingBitrate
		queryParameters["audioBitRate"] = audioBitRate
		queryParameters["startTimeTicks"] = startTimeTicks
		queryParameters["transcodingContainer"] = transcodingContainer
		queryParameters["transcodingProtocol"] = transcodingProtocol
		queryParameters["maxAudioSampleRate"] = maxAudioSampleRate
		queryParameters["maxAudioBitDepth"] = maxAudioBitDepth
		queryParameters["enableRemoteMedia"] = enableRemoteMedia
		queryParameters["breakOnNonKeyFrames"] = breakOnNonKeyFrames
		queryParameters["enableRedirection"] = enableRedirection
		val data = null
		val response = api.`get`<ByteReadChannel>("/Audio/{itemId}/universal", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets an audio stream.
	 *
	 * @param itemId The item id.
	 * @param container Optional. The audio container.
	 * @param mediaSourceId The media version id, if playing an alternate version.
	 * @param deviceId The device id of the client requesting. Used to stop encoding processes when
	 * needed.
	 * @param userId Optional. The user id.
	 * @param audioCodec Optional. The audio codec to transcode to.
	 * @param maxAudioChannels Optional. The maximum number of audio channels.
	 * @param transcodingAudioChannels Optional. The number of how many audio channels to transcode to.
	 * @param maxStreamingBitrate Optional. The maximum streaming bitrate.
	 * @param audioBitRate Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted
	 * this will be left to encoder defaults.
	 * @param startTimeTicks Optional. Specify a starting offset, in ticks. 1 tick = 10000 ms.
	 * @param transcodingContainer Optional. The container to transcode to.
	 * @param transcodingProtocol Optional. The transcoding protocol.
	 * @param maxAudioSampleRate Optional. The maximum audio sample rate.
	 * @param maxAudioBitDepth Optional. The maximum audio bit depth.
	 * @param enableRemoteMedia Optional. Whether to enable remote media.
	 * @param breakOnNonKeyFrames Optional. Whether to break on non key frames.
	 * @param enableRedirection Whether to enable redirection. Defaults to true.
	 * @param includeCredentials Add the access token to the url to make an authenticated request.
	 */
	public fun getUniversalAudioStreamUrl(
		itemId: UUID,
		container: Collection<String>? = emptyList(),
		mediaSourceId: String? = null,
		deviceId: String? = null,
		userId: UUID? = null,
		audioCodec: String? = null,
		maxAudioChannels: Int? = null,
		transcodingAudioChannels: Int? = null,
		maxStreamingBitrate: Int? = null,
		audioBitRate: Int? = null,
		startTimeTicks: Long? = null,
		transcodingContainer: String? = null,
		transcodingProtocol: String? = null,
		maxAudioSampleRate: Int? = null,
		maxAudioBitDepth: Int? = null,
		enableRemoteMedia: Boolean? = null,
		breakOnNonKeyFrames: Boolean? = false,
		enableRedirection: Boolean? = true,
		includeCredentials: Boolean = true
	): String {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["container"] = container
		queryParameters["mediaSourceId"] = mediaSourceId
		queryParameters["deviceId"] = deviceId
		queryParameters["userId"] = userId
		queryParameters["audioCodec"] = audioCodec
		queryParameters["maxAudioChannels"] = maxAudioChannels
		queryParameters["transcodingAudioChannels"] = transcodingAudioChannels
		queryParameters["maxStreamingBitrate"] = maxStreamingBitrate
		queryParameters["audioBitRate"] = audioBitRate
		queryParameters["startTimeTicks"] = startTimeTicks
		queryParameters["transcodingContainer"] = transcodingContainer
		queryParameters["transcodingProtocol"] = transcodingProtocol
		queryParameters["maxAudioSampleRate"] = maxAudioSampleRate
		queryParameters["maxAudioBitDepth"] = maxAudioBitDepth
		queryParameters["enableRemoteMedia"] = enableRemoteMedia
		queryParameters["breakOnNonKeyFrames"] = breakOnNonKeyFrames
		queryParameters["enableRedirection"] = enableRedirection
		return api.createUrl("/Audio/{itemId}/universal", pathParameters, queryParameters,
				includeCredentials)
	}
}
