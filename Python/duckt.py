class A:
    def one(self):
        print("HI")

    def two(self):
        print("sdgh")
class B:
    def one(self):
        print("sdfgh")

    def three(self):
        print("dfghj")

class Call:
    def four(self,ide):
        ide.one()

ide = B()

call1 = Call()
call1.four(ide)

