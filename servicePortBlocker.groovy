def SERVICE_PORT = 8080
ServerSocket server = new ServerSocket(SERVICE_PORT)
println "While this window is open, port ${SERVICE_PORT} is blocked."
while(true){
	Socket socket = server.accept()
	socket.close()
}
