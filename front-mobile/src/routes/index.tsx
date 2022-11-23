import React, { useEffect, useState } from "react";
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import { Text } from 'react-native'
import { Notice, Meetings, NavBar, MeetingDetails, Support } from '../pages';
import { colors, nav } from "../styles";


 export type stackParam = {
    Notice: undefined;
    Meetings: undefined;
    MeetingDetails: {id: number};
    Support: undefined;
 }

const Stack = createNativeStackNavigator();

const Routes: React.FC = () => {

    const [title, setTitle] = useState("Quadro de anuncio");
    
    const HeaderText: React.FC = () => <Text style={nav.leftText}>{title}</Text>

    return (
        <Stack.Navigator screenOptions={{ 
            headerTitle: " ",
            headerStyle: {
                backgroundColor: colors.darkBlue, 
            },
            
            headerLeft: () => <HeaderText />,
            headerRight: () => <NavBar screen={setTitle} /> ,
            }}>
    
            <Stack.Screen name="Notice" component={Notice} />
            <Stack.Screen name="Meetings" component={Meetings} />
            <Stack.Screen name="MeetingDetails" component={MeetingDetails} />
            <Stack.Screen name="Support" component={Support} />
        </Stack.Navigator>
    );
}

export default Routes;