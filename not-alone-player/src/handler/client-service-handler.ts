import { IJoinRequest } from 'src/codegen/common';
import { IHandler } from '../codegen/common/GameService';
import { PlayerService } from '../player/player-service';

export class ClientServiceHandler<Context> implements IHandler<Context> {

    private service: PlayerService;

    constructor() {
        this.service = new PlayerService();
    }

    public createGame(numberOfPlayers: number, context?: Context): number | Promise<number> {
        throw new Error('Method not implemented.');
    }

    public join(gameId: number, request: IJoinRequest, context?: Context): number | Promise<number> {
        throw new Error('Method not implemented.');
    }

    public startGame(gameId: number): void | Promise<void> {
        return this.service.startGame(gameId);
    }


    public add(left: number, right: number): number | Promise<number> {
        return Promise.resolve(right + left);
    }

}
