package com.grpcdemo.crudop.services;

import com.grpc.usersproto.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void postUser(UserPostReq request, StreamObserver<UserPostRes> responseObserver) {

        //request obj -> Entity model -> save in repo
        UserPostRes upr;
        super.postUser(request, responseObserver);
        /*String wallmessg= "wallet created"+ walletPostReq.getPhoneId()+"::"
                + walletPostReq.getPhone()+ "::"+ walletPostReq.getWallBalance();
        WalletPostRes walletPostRes= WalletPostRes.newBuilder().setWallmessg(wallmessg).build();

        responseObserver.onNext(walletPostRes);
        responseObserver.onCompleted();*/
    }

    @Override
    public void getUser(UserGetReq request, StreamObserver<UserGetRes> responseObserver) {
        super.getUser(request, responseObserver);
    }
}
