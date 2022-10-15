# IPLink
A plugin that prevents other people from accessing certain accounts through the use of IP Addresses. This is currently tested & designed for 1.8.8, and works on cracked / premium servers.

# Usage
In order to modify this code, you would need a IDE for Java and some knowledge of the Spigot-API. More on that here -> https://www.spigotmc.org/wiki/spigot-plugin-development/

## Adding yourself / someone else to the whitelist
In order to add yourself or someone else, you will need to nagivate to `src/xlz/protect` and open the JoinListener.java class. You'll need to fill in: 

 - `USERNAME` - the username of the person you want to whitelist
 - `IP-ADDRESS` - the **public** ip address the user will usually connect with
 - `KICK-REASON` - your desired reason to kick the intruder

Note that you'll need to compile as a non-runnable JAR file afterwards.

## Adding more people
If you are willing to add more people into the whitelist, the best way to do that is to copy the entire line code in method `onPlayerJoin(AsyncPlay... event)` and paste it, then filling it with new information.

If you want to add more people to 1 IP address, you can add another boolean in the first if statement and replace USERNAME with another username. For example: `if (event.getName().equalsIgnoreCase("Player1") || event.getName().equalsIgnoreCase("Player2"))`. You can add as much as you want.
