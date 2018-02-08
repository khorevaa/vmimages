
def tasks = [:]

def matrix = 
    {
        win: [
            "win10", "win7", "winserv2008", "winserv2012", "winserv2016"
        ],
        nix: [
            "deb-debian", "deb-ubuntu", "rpm-centos"
        ]
    }

matrix.win.each {
    tasks[${it}] = {
       node("AzureCloud") {
           bat "packer ${it}/base.json"
       }
    }
}

parallel tasks
