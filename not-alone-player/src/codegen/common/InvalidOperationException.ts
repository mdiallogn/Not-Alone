/* tslint:disable */
/* eslint-disable */
/*
 * Autogenerated by @creditkarma/thrift-typescript v3.7.6
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
*/
import * as thrift from "@creditkarma/thrift-server-core";
export interface IInvalidOperationException {
    code?: number;
    description?: string;
}
export interface IInvalidOperationExceptionArgs {
    code?: number;
    description?: string;
}
export const InvalidOperationExceptionCodec: thrift.IStructCodec<IInvalidOperationExceptionArgs, IInvalidOperationException> = {
    encode(args: IInvalidOperationExceptionArgs, output: thrift.TProtocol): void {
        const obj: any = {
            code: args.code,
            description: args.description
        };
        output.writeStructBegin("InvalidOperationException");
        if (obj.code != null) {
            output.writeFieldBegin("code", thrift.TType.I32, 1);
            output.writeI32(obj.code);
            output.writeFieldEnd();
        }
        if (obj.description != null) {
            output.writeFieldBegin("description", thrift.TType.STRING, 2);
            output.writeString(obj.description);
            output.writeFieldEnd();
        }
        output.writeFieldStop();
        output.writeStructEnd();
        return;
    },
    decode(input: thrift.TProtocol): IInvalidOperationException {
        let _args: any = {};
        input.readStructBegin();
        while (true) {
            const ret: thrift.IThriftField = input.readFieldBegin();
            const fieldType: thrift.TType = ret.fieldType;
            const fieldId: number = ret.fieldId;
            if (fieldType === thrift.TType.STOP) {
                break;
            }
            switch (fieldId) {
                case 1:
                    if (fieldType === thrift.TType.I32) {
                        const value_1: number = input.readI32();
                        _args.code = value_1;
                    }
                    else {
                        input.skip(fieldType);
                    }
                    break;
                case 2:
                    if (fieldType === thrift.TType.STRING) {
                        const value_2: string = input.readString();
                        _args.description = value_2;
                    }
                    else {
                        input.skip(fieldType);
                    }
                    break;
                default: {
                    input.skip(fieldType);
                }
            }
            input.readFieldEnd();
        }
        input.readStructEnd();
        return {
            code: _args.code,
            description: _args.description
        };
    }
};
export class InvalidOperationException extends thrift.StructLike implements IInvalidOperationException {
    public code?: number;
    public description?: string;
    public readonly _annotations: thrift.IThriftAnnotations = {};
    public readonly _fieldAnnotations: thrift.IFieldAnnotations = {};
    constructor(args: IInvalidOperationExceptionArgs = {}) {
        super();
        if (args.code != null) {
            const value_3: number = args.code;
            this.code = value_3;
        }
        if (args.description != null) {
            const value_4: string = args.description;
            this.description = value_4;
        }
    }
    public static read(input: thrift.TProtocol): InvalidOperationException {
        return new InvalidOperationException(InvalidOperationExceptionCodec.decode(input));
    }
    public static write(args: IInvalidOperationExceptionArgs, output: thrift.TProtocol): void {
        return InvalidOperationExceptionCodec.encode(args, output);
    }
    public write(output: thrift.TProtocol): void {
        return InvalidOperationExceptionCodec.encode(this, output);
    }
}
