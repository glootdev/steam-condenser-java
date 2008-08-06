/** 
 * This code is free software; you can redistribute it and/or modify it under
 * the terms of the new BSD License.
 */

package steamcondenser.steam.servers;

import java.io.IOException;
import java.net.InetAddress;

import steamcondenser.steam.sockets.SourceSocket;

/**
 * A Source game server.
 * @author Sebastian Staudt
 * @version $Id$
 */
public class SourceServer extends GameServer
{
	/**
	 * @param ipAddress The IP of the server to connect to
	 * @param portNumber The port number of the server
	 */
	public SourceServer(InetAddress ipAddress, int portNumber)
		throws IOException, Exception
	{
		super(portNumber);
		this.socket = new SourceSocket(ipAddress, portNumber);
	}
}