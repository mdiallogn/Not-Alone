namespace java fr.univnantes.alma.thrift
namespace js common

exception InvalidOperationException {
    1: i32 code,
    2: string description
}

exception GameNotFound {
    1: i32 code,
    2: string description
}

struct GamePhase {
    1: i32 GamePhase
}


struct Winner {
    1: string winner,
    2: string message
}


struct Response {
    1: bool value
    2: string detal
}


