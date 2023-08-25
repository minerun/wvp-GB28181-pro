package com.genersoft.iot.vmp.service;

import com.genersoft.iot.vmp.common.CommonGbChannel;

import java.util.List;

public interface ICommonGbChannelService {

    CommonGbChannel getChannel(String channelId);

    int add(CommonGbChannel channel);

    int delete(String channelId);

    int update(CommonGbChannel channel);

    boolean checkChannelInPlatform(String channelId, String platformServerId);

    /**
     * 从国标设备中同步通道
     *
     * @param gbDeviceId  国标设备编号
     * @param syncKeys    要同步的字段
     */
    boolean SyncChannelFromGb28181Device(String gbDeviceId, List<String> syncKeys);
}