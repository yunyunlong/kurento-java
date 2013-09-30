package com.kurento.kmf.media.commands.internal;

import com.kurento.kmf.media.internal.ProvidesMediaCommand;
import com.kurento.kms.thrift.api.mediaCommandDataTypesConstants;

@ProvidesMediaCommand(type = mediaCommandDataTypesConstants.GET_LOCAL_SDP, resultClass = StringCommandResult.class)
public class GetLocalSdpCommand extends VoidCommand {

	public GetLocalSdpCommand() {
		super(mediaCommandDataTypesConstants.GET_LOCAL_SDP);
	}

}