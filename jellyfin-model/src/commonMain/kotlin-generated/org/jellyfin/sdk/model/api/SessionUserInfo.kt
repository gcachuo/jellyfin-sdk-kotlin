// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Class SessionUserInfo.
 */
@Serializable
public data class SessionUserInfo(
	/**
	 * The user identifier.
	 */
	@SerialName("UserId")
	public val userId: UUID,
	/**
	 * The name of the user.
	 */
	@SerialName("UserName")
	public val userName: String? = null,
)
