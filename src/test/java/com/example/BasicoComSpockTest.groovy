import spock.lang.Specification

class BasicoComSpockTest extends Specification{

    def "Testar o tamanho do nome"() {
        expect:
        nome.size() == tamanho

        where:
        nome     | tamanho
        "Spock"  | 5
        "Kirk"   | 3
        "Scotty" | 6
    }

    def "Testar o tamnho dos textos"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }

}