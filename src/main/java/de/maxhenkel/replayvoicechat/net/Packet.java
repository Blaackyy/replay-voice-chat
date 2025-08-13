package de.maxhenkel.replayvoicechat.net;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;

public interface Packet<T extends Packet<T>> extends CustomPacketPayload {

    T fromBytes(FriendlyByteBuf buf) throws VersionCompatibilityException;

    void toBytes(FriendlyByteBuf buf);

    void onPacket();

    @Override
    CustomPacketPayload.Type<T> type();

}
