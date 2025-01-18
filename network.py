class network:
    class cable:
        def __init__(self):
            self.endpoints = [None, None]

        def connect(self, port1, port2):
            self.endpoints[0] = port1
            self.endpoints[1] = port2 # what if it's no longer port 0
            port1.value = 0
            port2.value = 1
            port1.connectedTo = self # maybe we should instead have a method on the ports that does this
            port2.connectedTo = self

        def signal(self, sender, message):
            self.endpoints[1 - sender].receive(message)

    class port:
        def __init__(self):# send in an object
            self.value = 0
            self.connectedTo = None #something here of a cable
            #newest implementation
            self.belongsTo = None

        def send(self): # this might need to be adjusted
            message = input("Enter message: ")
            self.connectedTo.signal(self.value, message)# we could send ourselves (address) or the value

        def receive(self, message):
            self.belongsTo.receive(message)

    class switch:
        def __init__(self, MAC, portCount):
            self.MAC = MAC
            self.FastEthernet0 = [] # this could be changed to port and have options for different ports
            for i in range(portCount):
                self.FastEthernet0.append(network.port()) #I wanted to have the name 'FastEthernet0'
                self.FastEthernet0[i].belongsTo = self

        #this should not be
        def receive(self, message):
            # here we process the frame
            print(f"switch 1 is receiving a message: {message}")

    class Interface(port):
        def __init__(self, iNum):
            super().__init__()
            self.MAC = input(f"Enter MAC for Interface {iNum}: ")
            self.IP = input(f"Enter IP for Interface {iNum}: ")
            self.MASK = input(f"Enter MASK for Interface {iNum}: ")

    class NIC(Interface):
        def __init__(self, iNum):
            super().__init__(iNum)
            self.Gateway = input(f"Enter Gateway for Interface {iNum}: ")

    class laptop:
        def __init__(self):
            self.interface = network.NIC(1)
            self.interface.belongsTo = self
            self.ARPTable = []

        def receive(self, message):
            print(f"laptop1 is receiving a message: {message}")

    class frame:
        def __init__(self, dMAC, sMAC, packet):
            self.dMAC = dMAC
            self.sMAC = sMAC
            self.packet = packet

    class packet:
        def __init__(self, sIP, dIP, segment):
            self.sIP = sIP
            self.dIP = dIP
            self.segment = segment

    class segment:
        def __init__(self, sPort, dPort, data):
            self.sPort = sPort
            self.dPort = dPort
            self.data = data

    class router:
        def __init__(self):
            self.GigabitEthernet0 = []
            for i in range(2):
                self.GigabitEthernet0.append(network.Interface(i))
                self.GigabitEthernet0[i].belongsTo = self
            self.MACTABLE = []

        def receive():
            pass