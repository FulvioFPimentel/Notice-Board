import react from 'react';
import { useNavigation } from '@react-navigation/native'
import { View, Text, TouchableOpacity, ScrollView } from 'react-native';
import { StackNavigationProp } from '@react-navigation/stack';

import { colors, theme } from '../styles';

type navigateParam = {
    Notice: undefined;
}

type StackProp = StackNavigationProp<navigateParam>;

const Meetings: React.FC = () => {

    const navigation = useNavigation<StackProp>();
    return (
        <ScrollView>
        <View style={theme.container}>

            <View style={theme.card}>
                <Text>Bem vindo a o Notice Board</Text>
                <TouchableOpacity style={{
                    backgroundColor: "#000",
                    padding: 10,
                    borderRadius:5,
                    width: 285,
                    alignItems: 'center',
                    justifyContent: 'center',
                }}
                onPress={() => navigation.navigate('Notice')}
                >
                    <Text style={{ color:"#fff"}}>Clique aqui</Text>
                </TouchableOpacity>
            </View>
        </View>
        </ScrollView>
    );
}

export default Meetings;